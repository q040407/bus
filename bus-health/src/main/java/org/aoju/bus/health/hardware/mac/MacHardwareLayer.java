/*********************************************************************************
 *                                                                               *
 * The MIT License                                                               *
 *                                                                               *
 * Copyright (c) 2015-2020 aoju.org and other contributors.                      *
 *                                                                               *
 * Permission is hereby granted, free of charge, to any person obtaining a copy  *
 * of this software and associated documentation files (the "Software"), to deal *
 * in the Software without restriction, including without limitation the rights  *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell     *
 * copies of the Software, and to permit persons to whom the Software is         *
 * furnished to do so, subject to the following conditions:                      *
 *                                                                               *
 * The above copyright notice and this permission notice shall be included in    *
 * all copies or substantial portions of the Software.                           *
 *                                                                               *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR    *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,      *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE   *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER        *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN     *
 * THE SOFTWARE.                                                                 *
 ********************************************************************************/
package org.aoju.bus.health.hardware.mac;

import org.aoju.bus.health.hardware.*;

/**
 * <p>
 * MacHardwareAbstractionLayer class.
 * </p>
 *
 * @author Kimi Liu
 * @version 5.8.6
 * @since JDK 1.8+
 */
public class MacHardwareLayer extends AbstractHardwareLayer {

    @Override
    public ComputerSystem createComputerSystem() {
        return new MacComputerSystem();
    }

    @Override
    public GlobalMemory createMemory() {
        return new MacGlobalMemory();
    }

    @Override
    public CentralProcessor createProcessor() {
        return new MacCentralProcessor();
    }

    @Override
    public Sensors createSensors() {
        return new MacSensors();
    }

    @Override
    public PowerSource[] getPowerSources() {
        return MacPowerSource.getPowerSources();
    }

    @Override
    public HWDiskStore[] getDiskStores() {
        return new MacDisks().getDisks();
    }

    @Override
    public Display[] getDisplays() {
        return MacDisplay.getDisplays();
    }

    @Override
    public NetworkIF[] getNetworkIFs() {
        return new MacNetworks().getNetworks();
    }

    @Override
    public UsbDevice[] getUsbDevices(boolean tree) {
        return MacUsbDevice.getUsbDevices(tree);
    }

    @Override
    public SoundCard[] getSoundCards() {
        return MacSoundCard.getSoundCards().toArray(new SoundCard[0]);
    }
}
