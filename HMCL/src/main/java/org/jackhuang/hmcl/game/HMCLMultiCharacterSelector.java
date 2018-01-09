/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2017  huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hmcl.game;

import org.jackhuang.hmcl.auth.Account;
import org.jackhuang.hmcl.auth.MultiCharacterSelector;
import org.jackhuang.hmcl.auth.NoSelectedCharacterException;
import org.jackhuang.hmcl.auth.yggdrasil.GameProfile;

import java.util.List;

/**
 * @author huangyuhui
 */
public final class HMCLMultiCharacterSelector implements MultiCharacterSelector {
    public static final HMCLMultiCharacterSelector INSTANCE = new HMCLMultiCharacterSelector();

    private HMCLMultiCharacterSelector() {}

    @Override
    public GameProfile select(Account account, List<GameProfile> names) throws NoSelectedCharacterException {
        return names.stream().findFirst().orElseThrow(() -> new NoSelectedCharacterException(account));
    }
}
