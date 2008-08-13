/*-
 * Copyright (C) 2008 Erik Larsson
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.jparted.lib.fs;

import org.catacombae.jparted.lib.DataLocator;

/**
 *
 * @author erik
 */
public class FileSystemRecognizer {
    public FileSystemMajorType detectFileSystem(DataLocator fsLocator) {
        // File system recognizer code should be modular.
        return FileSystemMajorType.UNKNOWN;
    }
}