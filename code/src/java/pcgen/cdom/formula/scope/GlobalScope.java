/*
 * Copyright 2015 (C) Tom Parker <thpr@users.sourceforge.net>
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package pcgen.cdom.formula.scope;

import java.util.Optional;

import pcgen.base.formula.base.LegalScope;

/**
 * This is the global variable scope
 */
public class GlobalScope implements LegalScope
{
	/**
	 * The name of the Global Scope for PCGen characters, publicly available for reuse...
	 */
	public static final String GLOBAL_SCOPE_NAME = "PC";

	/**
	 * The String representation of the objects covered by this Scope
	 * 
	 * @see pcgen.base.formula.base.LegalScope#getName()
	 */
	@Override
	public String getName()
	{
		return GLOBAL_SCOPE_NAME;
	}

	/**
	 * @see pcgen.base.formula.base.LegalScope#getParentScope()
	 */
	@Override
	public Optional<LegalScope> getParentScope()
	{
		return Optional.empty();
	}
}
