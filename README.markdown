# Reproducing the issue

This sample demonstrates the double broadcast receiver events on dynamic features module where intent is set with package name to workaround the api 26 limitations.

1. Filter logs by TEST_CASE
2. Launch the app. Registered specific broadcast receivers will be listed immediately through `queryBroadcastReceivers`as `ResolveInfo`. There will be 2 identical apart from one having `"splitName": "dynamic_feature_name"` (kotlin in this case) under `activityInfo`, coming from dynamic feature manifest, and another one with null value, coming from base manifest.
3. Click `START KOTLIN FEATURE`
4. Click `SEND BROADCAST`. The sending even is logged followed by 2 receiving events.

The receiver is called `CustomBroadcastReceiver` and the event is triggered in `KotlinSampleActivity`.
