
package org.teameos.jellybean.settings;

import java.util.LinkedHashMap;
import java.util.Map;

public final class EOSConstants {
    /* EOS SETTINGS STRINGS */
    /**
     * @hide
     */
    public static final String SYSTEMUI_BATTERY_ICON_VISIBLE = "eos_systemui_battery_icon_visible";

    /**
     * @hide
     */
    public static final int SYSTEMUI_BATTERY_ICON_VISIBLE_DEF = 1;

    /**
     * @hide
     */
    public static final String SYSTEMUI_BATTERY_TEXT_VISIBLE = "eos_systemui_battery_text_visible";

    /**
     * @hide
     */
    public static final int SYSTEMUI_BATTERY_TEXT_VISIBLE_DEF = 1;

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_ENABLED = "eos_systemui_settings_enabled";

    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_ENABLED_DEF = 0;

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_ENABLED_CONTROLS = "eos_systemui_settings_enabled_controls";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_PHONE_TOP = "eos_systemui_settings_phone_top";

    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_PHONE_TOP_DEF = 0;

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_PHONE_BOTTOM = "eos_systemui_settings_phone_bottom";

    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_PHONE_BOTTOM_DEF = 0;

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_AIRPLANE = "eos_systemui_settings_airplane";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_AUTO_ROTATE = "eos_systemui_settings_autorotate";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_BLUETOOTH = "eos_systemui_settings_bluetooth";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_GPS = "eos_systemui_settings_gps";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_NOTIFICATIONS = "eos_systemui_settings_notifications";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_SILENT = "eos_systemui_settings_silent";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_TORCH = "eos_systemui_settings_torch";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_WIFI = "eos_systemui_settings_wifi";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_MOBILEDATA = "eos_systemui_settings_mobiledata";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_LTE = "eos_systemui_settings_lte";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_WIFITETHER = "eos_systemui_settings_wifitether";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_USBTETHER = "eos_systemui_settings_usbtether";

    /**
     * @hide
     */
    public static final String[] SYSTEMUI_SETTINGS_DEFAULTS = {
            SYSTEMUI_SETTINGS_WIFI,
            SYSTEMUI_SETTINGS_BLUETOOTH,
            SYSTEMUI_SETTINGS_GPS,
            SYSTEMUI_SETTINGS_AUTO_ROTATE,
            SYSTEMUI_SETTINGS_SILENT
    };

    /**
     * @hide
     */
    public static final Map<String, Boolean> getEosSystemUISettingsMap() {
        LinkedHashMap<String, Boolean> map = new LinkedHashMap<String, Boolean>();
        map.put(SYSTEMUI_SETTINGS_AIRPLANE, false);
        map.put(SYSTEMUI_SETTINGS_AUTO_ROTATE, true);
        map.put(SYSTEMUI_SETTINGS_BLUETOOTH, true);
        map.put(SYSTEMUI_SETTINGS_GPS, true);
        map.put(SYSTEMUI_SETTINGS_NOTIFICATIONS, false);
        map.put(SYSTEMUI_SETTINGS_SILENT, true);
        map.put(SYSTEMUI_SETTINGS_TORCH, false);
        map.put(SYSTEMUI_SETTINGS_WIFI, true);
        map.put(SYSTEMUI_SETTINGS_MOBILEDATA, false);
        map.put(SYSTEMUI_SETTINGS_WIFITETHER, false);
        map.put(SYSTEMUI_SETTINGS_USBTETHER, false);
        map.put(SYSTEMUI_SETTINGS_LTE, false);

        return map;
    }

    /***
     * EOS Intent constants
     */

    /**
     * Broadcast Action: Request to turn Eos Torch application off
     * 
     * @hide
     */
    public static final String ACTION_TORCH_OFF = "android.intent.action.TORCH_OFF";
    /**
     * @hide
     */
    public static final String INTENT_TELEPHONY_LTE_TOGGLE = "org.teameos.intent.action.TOGGLE_LTE";

    /**
     * @hide
     */
    public static final String INTENT_TELEPHONY_LTE_TOGGLE_KEY = "eos_intent_telephony_lte_mode_key";

    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_WIFI = "eos_systemui_settings_standard_wifi";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_WIFI_DEF = 1;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_AIRPLANE = "eos_systemui_settings_standard_airplane";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_AIRPLANE_DEF = 1;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_ROTATION = "eos_systemui_settings_standard_rotation";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_ROTATION_DEF = 1;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_VOLUME = "eos_systemui_settings_standard_volume";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_VOLUME_DEF = 0;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_BRIGHTNESS = "eos_systemui_settings_standard_brightness";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_BRIGHTNESS_DEF = 1;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_NOTIFICATIONS = "eos_systemui_settings_standard_notifications";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_NOTIFICATIONS_DEF = 1;
    /**
     * @hide
     */
    public static final String SYSTEMUI_SETTINGS_STANDARD_SETTINGS = "eos_systemui_settings_standard_settings";
    /**
     * @hide
     */
    public static final int SYSTEMUI_SETTINGS_STANDARD_SETTINGS_DEF = 1;
    /**
     * The touchpad gesture mode. (0 = spots, 1 = pointer)
     * @hide
     */
    public static final String DEVICE_SETTINGS_TOUCHPAD_MODE = "eos_device_settings_touchpad_mode";
    /**
     * Whether or not the touchpad is enabled. (0 = false, 1 = true)
     * @hide
     */
    public static final String DEVICE_SETTINGS_TOUCHPAD_STATUS = "eos_device_settings_touchpad_status";
    /**
     * Value for {@link #EOS_TOUCHPAD_STATUS} to use
     * the touchpad located on the hardware keyboard dock.
     * @hide
     */
    public static final int DEVICE_SETTINGS_TOUCHPAD_DISABLED = 0;
    /**
     * Value for {@link #EOS_TOUCHPAD_STATUS} to use
     * the touchpad located on the hardware keyboard dock.
     * @hide
     */
    public static final int DEVICE_SETTINGS_TOUCHPAD_ENABLED = 1;
    /**
     * On the grouper, we use this to switch between the hybrid UI and the tablet UI
     * @hide
     */
    public static final String SYSTEMUI_USE_TABLET_UI = "eos_systemui_tablet_ui";
    /**
     * @hide
     */
    public static final int SYSTEMUI_USE_TABLET_UI_DEF = 0;

    /**
     * @hide
     */
    public static final String SYSTEM_VOLUME_KEYS_SWITCH_ON_ROTATION = "eos_system_volume_keys_switch_on_rotation";

    /**
     * @hide
     */
    public static final int SYSTEM_VOLUME_KEYS_SWITCH_ON_ROTATION_DEF = 1;
}
