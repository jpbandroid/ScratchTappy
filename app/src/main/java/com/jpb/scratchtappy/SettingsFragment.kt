package com.jpb.scratchtappy

import android.app.Dialog
import android.content.Context
import android.icu.text.Collator.getInstance
import android.os.Build
import android.os.Bundle
import android.os.Vibrator
import android.provider.SyncStateContract
import android.text.Editable.Factory.getInstance
import android.widget.Switch
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import android.widget.CompoundButton
import androidx.core.app.ActivityCompat.recreate
import androidx.preference.Preference
import java.text.Collator.getInstance
import java.util.Calendar.getInstance


class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
        val deviceName = Build.MODEL
        }}