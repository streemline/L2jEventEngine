/*
 * Copyright (C) 2015-2015 L2J EventEngine
 *
 * This file is part of L2J EventEngine.
 *
 * L2J EventEngine is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * L2J EventEngine is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.eventengine.enums;

/**
 * @author fissban
 */
public enum EventEngineState
{
	/** No se encuentro ningun evento corriendo */
	/** Esta habilitado el registro de usuarios */
	/** Esta habilitado el voto a los eventos */
	REGISTER,
	/** Ejecutamos el evento mas votado o uno al azar */
	RUN_EVENT,
	/** Tenemos un evento corriendo */
	/** NO Esta habilitado el registro de usuarios */
	/** NO Esta habilitado el voto a los eventos */
	RUNNING_EVENT,
}
