/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2018 Serge Rider (serge@jkiss.org)
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jkiss.dbeaver.debug.internal.ui;

import org.eclipse.osgi.util.NLS;

public class DebugUIMessages extends NLS {

    private static final String BUNDLE_NAME = "org.jkiss.dbeaver.debug.internal.ui.DebugUIMessages"; //$NON-NLS-1$

    public static String DatabaseStandardBreakpointPane_description;
    public static String DatabaseStandardBreakpointPane_name;

    public static String DatabaseTab_connection_group_text;
    public static String DatabaseTab_driver_label_text;
    public static String DatabaseTab_datasource_label_text;

    public static String DatabaseTab_procedure_group_text;
    public static String DatabaseTab_database_label_text;
    public static String DatabaseTab_schema_label_text;
    public static String DatabaseTab_oid_label_text;
    public static String DatabaseTab_name_label_text;

    public static String DatabaseTab_attach_group_text;
    public static String DatabaseTab_script_execute_text;

    public static String DatabaseTab_name;

    public static String DatabaseLaunchShortcut_e_launch;
    public static String DatabaseLaunchShortcut_select_configuration_title;
    public static String DatabaseLaunchShortcut_select_configuration_message;
    
    public static String DatabaseLaunchShortcut_e_editor_empty;
    public static String DatabaseLaunchShortcut_e_selection_empty;

    public static String DatabaseLaunchShortcut_select_message;
    public static String DatabaseLaunchShortcut_select_title;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, DebugUIMessages.class);
    }

    private DebugUIMessages() {
    }
}
