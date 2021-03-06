/*
 * This file is part of SpoutPluginAPI (http://www.spout.org/).
 *
 * SpoutPluginAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutPluginAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.spoutapi.material.item;

import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.Tool;

public class GenericTool extends GenericItem implements Tool {
	public GenericTool(String name, int id) {
		super(name, id);
	}

	@Override
	public short getDurability() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Tool setDurability(short durability) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public float getStrengthModifier(Block block) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Tool setStrengthModifier(Block block, float modifier) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Block[] getStrengthModifiedBlocks() {
		// TODO Auto-generated method stub
		return null;
	}
}
