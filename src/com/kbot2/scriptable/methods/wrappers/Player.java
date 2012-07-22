/*	
	Copyright 2012 Jan Ove Saltvedt
	
	This file is part of KBot.

    KBot is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    KBot is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with KBot.  If not, see <http://www.gnu.org/licenses/>.
	
*/

/*
 * Copyright � 2010 Jan Ove Saltvedt.
 * All rights reserved.
 */

package com.kbot2.scriptable.methods.wrappers;

import com.kbot2.bot.BotEnvironment;

/**
 * Created by IntelliJ IDEA.
 * User: Jan Ove Saltvedt
 * Date: Jan 15, 2010
 * Time: 3:24:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player extends Character{
    private com.kbotpro.scriptsystem.wrappers.Player player;

    public Player(BotEnvironment botEnv, com.kbotpro.scriptsystem.wrappers.Player player) {
        super(botEnv, player);
        this.player = player;
    }

    public String getName() {
        return player.getName();
    }

    public String toString(){
        return getName()+"(o="+getOrientation()+",a="+getAnimation()+",m="+getMessage()+");";
    }
}
