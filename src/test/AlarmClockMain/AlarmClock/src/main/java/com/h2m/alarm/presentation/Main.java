/**
 * SonarQube Sonargraph Integration Plugin
 * Copyright (C) 2016 hello2morrow GmbH
 * mailto: support AT hello2morrow DOT com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.h2m.alarm.presentation;

import com.h2m.alarm.model.AlarmClock;

public final class Main
{
    public static void main(String[] args)
    {
        AlarmToConsole alarmToConsole = new AlarmToConsole();
        AlarmToFile alarmToFile = new AlarmToFile();
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.addObserver(alarmToConsole, AlarmClock.ALARM_EVENT);
        alarmClock.addObserver(alarmToFile, AlarmClock.ALARM_EVENT);
        new Thread(alarmClock).run();
    }
    
    public static void dummyMethodForCodeDuplication() {
    	int i = 0;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	i++;
    	
    	
    }
}