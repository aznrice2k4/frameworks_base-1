#
# FNV Audio package containing sounds not found in AOSP
#
# Include this file in a product makefile to include these audio files
#
#

LOCAL_PATH:= frameworks/base/data/sounds

PRODUCT_COPY_FILES += \
	$(LOCAL_PATH)/fnvsounds/Nexus.mp3:system/media/audio/notifications/Nexus.mp3 \
	$(LOCAL_PATH)/fnvsounds/ThemosICS.mp3:system/media/audio/ringtones/ThemosICS.mp3

