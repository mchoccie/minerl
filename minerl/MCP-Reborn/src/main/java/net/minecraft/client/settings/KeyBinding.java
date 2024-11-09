package net.minecraft.client.settings;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.Util;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KeyBinding implements Comparable<KeyBinding> {
   private static final Map<String, KeyBinding> KEYBIND_ARRAY = Maps.newHashMap();
   private static final Map<InputMappings.Input, KeyBinding> HASH = Maps.newHashMap();
   private static final Set<String> KEYBIND_SET = Sets.newHashSet();
   private static final Map<String, Integer> CATEGORY_ORDER = Util.make(Maps.newHashMap(), (map) -> {
      map.put("key.categories.movement", 1);
      map.put("key.categories.gameplay", 2);
      map.put("key.categories.inventory", 3);
      map.put("key.categories.creative", 4);
      map.put("key.categories.multiplayer", 5);
      map.put("key.categories.ui", 6);
      map.put("key.categories.misc", 7);
   });
   private final String keyDescription;
   private final InputMappings.Input keyCodeDefault;
   private final String keyCategory;
   private InputMappings.Input keyCode;
   private boolean pressed;
   private int pressTime;

   public static void onTick(InputMappings.Input key) {
      KeyBinding keybinding = HASH.get(key);
      if (keybinding != null) {
         ++keybinding.pressTime;
      }

   }

   public static void setKeyBindState(InputMappings.Input key, boolean held) {
      KeyBinding keybinding = HASH.get(key);
      if (keybinding != null) {
         keybinding.setPressed(held);
      }

   }

   public static void updateKeyBindState() {
      for(KeyBinding keybinding : KEYBIND_ARRAY.values()) {
         if (keybinding.keyCode.getType() == InputMappings.Type.KEYSYM && keybinding.keyCode.getKeyCode() != InputMappings.INPUT_INVALID.getKeyCode()) {
            keybinding.setPressed(InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), keybinding.keyCode.getKeyCode()));
         }
      }

   }

   public static void unPressAllKeys() {
      for(KeyBinding keybinding : KEYBIND_ARRAY.values()) {
         keybinding.unpressKey();
      }

   }

   public static void resetKeyBindingArrayAndHash() {
      HASH.clear();

      for(KeyBinding keybinding : KEYBIND_ARRAY.values()) {
         HASH.put(keybinding.keyCode, keybinding);
      }

   }

   public KeyBinding(String description, int keyCode, String category) {
      this(description, InputMappings.Type.KEYSYM, keyCode, category);
   }

   public KeyBinding(String description, InputMappings.Type type, int code, String category) {
      this.keyDescription = description;
      this.keyCode = type.getOrMakeInput(code);
      this.keyCodeDefault = this.keyCode;
      this.keyCategory = category;
      KEYBIND_ARRAY.put(description, this);
      HASH.put(this.keyCode, this);
      KEYBIND_SET.add(category);
   }

   public boolean isKeyDown() {
      return this.pressed;
   }

   public String getKeyCategory() {
      return this.keyCategory;
   }

   public boolean isPressed() {
      if (this.pressTime == 0) {
         return false;
      } else {
         --this.pressTime;
         return true;
      }
   }

   private void unpressKey() {
      this.pressTime = 0;
      this.setPressed(false);
   }

   public String getKeyDescription() {
      return this.keyDescription;
   }

   public InputMappings.Input getDefault() {
      return this.keyCodeDefault;
   }

   public void bind(InputMappings.Input key) {
      this.keyCode = key;
   }

   public int compareTo(KeyBinding p_compareTo_1_) {
      return this.keyCategory.equals(p_compareTo_1_.keyCategory) ? I18n.format(this.keyDescription).compareTo(I18n.format(p_compareTo_1_.keyDescription)) : CATEGORY_ORDER.get(this.keyCategory).compareTo(CATEGORY_ORDER.get(p_compareTo_1_.keyCategory));
   }

   public static Supplier<ITextComponent> getDisplayString(String key) {
      KeyBinding keybinding = KEYBIND_ARRAY.get(key);
      return keybinding == null ? () -> {
         return new TranslationTextComponent(key);
      } : keybinding::func_238171_j_;
   }

   public boolean conflicts(KeyBinding binding) {
      return this.keyCode.equals(binding.keyCode);
   }

   public boolean isInvalid() {
      return this.keyCode.equals(InputMappings.INPUT_INVALID);
   }

   public boolean matchesKey(int keysym, int scancode) {
      if (keysym == InputMappings.INPUT_INVALID.getKeyCode()) {
         return this.keyCode.getType() == InputMappings.Type.SCANCODE && this.keyCode.getKeyCode() == scancode;
      } else {
         return this.keyCode.getType() == InputMappings.Type.KEYSYM && this.keyCode.getKeyCode() == keysym;
      }
   }

   public boolean matchesMouseKey(int key) {
      return this.keyCode.getType() == InputMappings.Type.MOUSE && this.keyCode.getKeyCode() == key;
   }

   public ITextComponent func_238171_j_() {
      return this.keyCode.func_237520_d_();
   }

   public boolean isDefault() {
      return this.keyCode.equals(this.keyCodeDefault);
   }

   public String getTranslationKey() {
      return this.keyCode.getTranslationKey();
   }

   public void setPressed(boolean valueIn) {
      this.pressed = valueIn;
   }
}
