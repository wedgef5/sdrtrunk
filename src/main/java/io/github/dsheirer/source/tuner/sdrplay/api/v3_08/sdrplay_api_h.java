/*
 * *****************************************************************************
 * Copyright (C) 2014-2023 Dennis Sheirer
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_08;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.OfAddress;
import static java.lang.foreign.ValueLayout.OfByte;
import static java.lang.foreign.ValueLayout.OfDouble;
import static java.lang.foreign.ValueLayout.OfFloat;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;
import static java.lang.foreign.ValueLayout.OfShort;
public class sdrplay_api_h  {

    /* package-private */ sdrplay_api_h() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_LONG$LAYOUT;
    public static OfInt C_LONG = Constants$root.C_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static int RSPIA_NUM_LNA_STATES() {
        return (int)10L;
    }
    public static int RSPIA_NUM_LNA_STATES_AM() {
        return (int)7L;
    }
    public static int RSPIA_NUM_LNA_STATES_LBAND() {
        return (int)9L;
    }
    public static int RSPII_NUM_LNA_STATES() {
        return (int)9L;
    }
    public static int RSPII_NUM_LNA_STATES_AMPORT() {
        return (int)5L;
    }
    public static int RSPII_NUM_LNA_STATES_420MHZ() {
        return (int)6L;
    }
    public static int RSPDUO_NUM_LNA_STATES() {
        return (int)10L;
    }
    public static int RSPDUO_NUM_LNA_STATES_AMPORT() {
        return (int)5L;
    }
    public static int RSPDUO_NUM_LNA_STATES_AM() {
        return (int)7L;
    }
    public static int RSPDUO_NUM_LNA_STATES_LBAND() {
        return (int)9L;
    }
    public static int RSPDX_NUM_LNA_STATES() {
        return (int)28L;
    }
    public static int RSPDX_NUM_LNA_STATES_AMPORT2_0_12() {
        return (int)19L;
    }
    public static int RSPDX_NUM_LNA_STATES_AMPORT2_12_50() {
        return (int)20L;
    }
    public static int RSPDX_NUM_LNA_STATES_AMPORT2_50_60() {
        return (int)25L;
    }
    public static int RSPDX_NUM_LNA_STATES_VHF_BAND3() {
        return (int)27L;
    }
    public static int RSPDX_NUM_LNA_STATES_420MHZ() {
        return (int)21L;
    }
    public static int RSPDX_NUM_LNA_STATES_LBAND() {
        return (int)19L;
    }
    public static int RSPDX_NUM_LNA_STATES_DX() {
        return (int)22L;
    }
    public static int sdrplay_api_Rsp2_ANTENNA_A() {
        return (int)5L;
    }
    public static int sdrplay_api_Rsp2_ANTENNA_B() {
        return (int)6L;
    }
    public static int sdrplay_api_Rsp2_AMPORT_1() {
        return (int)1L;
    }
    public static int sdrplay_api_Rsp2_AMPORT_2() {
        return (int)0L;
    }
    public static int sdrplay_api_RspDuoMode_Unknown() {
        return (int)0L;
    }
    public static int sdrplay_api_RspDuoMode_Single_Tuner() {
        return (int)1L;
    }
    public static int sdrplay_api_RspDuoMode_Dual_Tuner() {
        return (int)2L;
    }
    public static int sdrplay_api_RspDuoMode_Master() {
        return (int)4L;
    }
    public static int sdrplay_api_RspDuoMode_Slave() {
        return (int)8L;
    }
    public static int sdrplay_api_RspDuo_AMPORT_1() {
        return (int)1L;
    }
    public static int sdrplay_api_RspDuo_AMPORT_2() {
        return (int)0L;
    }
    public static int sdrplay_api_BW_Undefined() {
        return (int)0L;
    }
    public static int sdrplay_api_BW_0_200() {
        return (int)200L;
    }
    public static int sdrplay_api_BW_0_300() {
        return (int)300L;
    }
    public static int sdrplay_api_BW_0_600() {
        return (int)600L;
    }
    public static int sdrplay_api_BW_1_536() {
        return (int)1536L;
    }
    public static int sdrplay_api_BW_5_000() {
        return (int)5000L;
    }
    public static int sdrplay_api_BW_6_000() {
        return (int)6000L;
    }
    public static int sdrplay_api_BW_7_000() {
        return (int)7000L;
    }
    public static int sdrplay_api_BW_8_000() {
        return (int)8000L;
    }
    public static int sdrplay_api_IF_Undefined() {
        return (int)-1L;
    }
    public static int sdrplay_api_IF_Zero() {
        return (int)0L;
    }
    public static int sdrplay_api_IF_0_450() {
        return (int)450L;
    }
    public static int sdrplay_api_IF_1_620() {
        return (int)1620L;
    }
    public static int sdrplay_api_IF_2_048() {
        return (int)2048L;
    }
    public static int sdrplay_api_LO_Undefined() {
        return (int)0L;
    }
    public static int sdrplay_api_LO_Auto() {
        return (int)1L;
    }
    public static int sdrplay_api_LO_120MHz() {
        return (int)2L;
    }
    public static int sdrplay_api_LO_144MHz() {
        return (int)3L;
    }
    public static int sdrplay_api_LO_168MHz() {
        return (int)4L;
    }
    public static int sdrplay_api_EXTENDED_MIN_GR() {
        return (int)0L;
    }
    public static int sdrplay_api_NORMAL_MIN_GR() {
        return (int)20L;
    }
    public static int sdrplay_api_Tuner_Neither() {
        return (int)0L;
    }
    public static int sdrplay_api_Tuner_A() {
        return (int)1L;
    }
    public static int sdrplay_api_Tuner_B() {
        return (int)2L;
    }
    public static int sdrplay_api_Tuner_Both() {
        return (int)3L;
    }
    public static int sdrplay_api_RspDx_ANTENNA_A() {
        return (int)0L;
    }
    public static int sdrplay_api_RspDx_ANTENNA_B() {
        return (int)1L;
    }
    public static int sdrplay_api_RspDx_ANTENNA_C() {
        return (int)2L;
    }
    public static int sdrplay_api_RspDx_HDRMODE_BW_0_200() {
        return (int)0L;
    }
    public static int sdrplay_api_RspDx_HDRMODE_BW_0_500() {
        return (int)1L;
    }
    public static int sdrplay_api_RspDx_HDRMODE_BW_1_200() {
        return (int)2L;
    }
    public static int sdrplay_api_RspDx_HDRMODE_BW_1_700() {
        return (int)3L;
    }
    public static int sdrplay_api_ISOCH() {
        return (int)0L;
    }
    public static int sdrplay_api_BULK() {
        return (int)1L;
    }
    public static int sdrplay_api_AGC_DISABLE() {
        return (int)0L;
    }
    public static int sdrplay_api_AGC_100HZ() {
        return (int)1L;
    }
    public static int sdrplay_api_AGC_50HZ() {
        return (int)2L;
    }
    public static int sdrplay_api_AGC_5HZ() {
        return (int)3L;
    }
    public static int sdrplay_api_AGC_CTRL_EN() {
        return (int)4L;
    }
    public static int sdrplay_api_ADSB_DECIMATION() {
        return (int)0L;
    }
    public static int sdrplay_api_ADSB_NO_DECIMATION_LOWPASS() {
        return (int)1L;
    }
    public static int sdrplay_api_ADSB_NO_DECIMATION_BANDPASS_2MHZ() {
        return (int)2L;
    }
    public static int sdrplay_api_ADSB_NO_DECIMATION_BANDPASS_3MHZ() {
        return (int)3L;
    }
    public static int sdrplay_api_Overload_Detected() {
        return (int)0L;
    }
    public static int sdrplay_api_Overload_Corrected() {
        return (int)1L;
    }
    public static int sdrplay_api_MasterInitialised() {
        return (int)0L;
    }
    public static int sdrplay_api_SlaveAttached() {
        return (int)1L;
    }
    public static int sdrplay_api_SlaveDetached() {
        return (int)2L;
    }
    public static int sdrplay_api_SlaveInitialised() {
        return (int)3L;
    }
    public static int sdrplay_api_SlaveUninitialised() {
        return (int)4L;
    }
    public static int sdrplay_api_MasterDllDisappeared() {
        return (int)5L;
    }
    public static int sdrplay_api_SlaveDllDisappeared() {
        return (int)6L;
    }
    public static int sdrplay_api_GainChange() {
        return (int)0L;
    }
    public static int sdrplay_api_PowerOverloadChange() {
        return (int)1L;
    }
    public static int sdrplay_api_DeviceRemoved() {
        return (int)2L;
    }
    public static int sdrplay_api_RspDuoModeChange() {
        return (int)3L;
    }
    public static int sdrplay_api_DeviceFailure() {
        return (int)4L;
    }
    public static OfAddress HANDLE = Constants$root.C_POINTER$LAYOUT;
    public static int sdrplay_api_Success() {
        return (int)0L;
    }
    public static int sdrplay_api_Fail() {
        return (int)1L;
    }
    public static int sdrplay_api_InvalidParam() {
        return (int)2L;
    }
    public static int sdrplay_api_OutOfRange() {
        return (int)3L;
    }
    public static int sdrplay_api_GainUpdateError() {
        return (int)4L;
    }
    public static int sdrplay_api_RfUpdateError() {
        return (int)5L;
    }
    public static int sdrplay_api_FsUpdateError() {
        return (int)6L;
    }
    public static int sdrplay_api_HwError() {
        return (int)7L;
    }
    public static int sdrplay_api_AliasingError() {
        return (int)8L;
    }
    public static int sdrplay_api_AlreadyInitialised() {
        return (int)9L;
    }
    public static int sdrplay_api_NotInitialised() {
        return (int)10L;
    }
    public static int sdrplay_api_NotEnabled() {
        return (int)11L;
    }
    public static int sdrplay_api_HwVerError() {
        return (int)12L;
    }
    public static int sdrplay_api_OutOfMemError() {
        return (int)13L;
    }
    public static int sdrplay_api_ServiceNotResponding() {
        return (int)14L;
    }
    public static int sdrplay_api_StartPending() {
        return (int)15L;
    }
    public static int sdrplay_api_StopPending() {
        return (int)16L;
    }
    public static int sdrplay_api_InvalidMode() {
        return (int)17L;
    }
    public static int sdrplay_api_FailedVerification1() {
        return (int)18L;
    }
    public static int sdrplay_api_FailedVerification2() {
        return (int)19L;
    }
    public static int sdrplay_api_FailedVerification3() {
        return (int)20L;
    }
    public static int sdrplay_api_FailedVerification4() {
        return (int)21L;
    }
    public static int sdrplay_api_FailedVerification5() {
        return (int)22L;
    }
    public static int sdrplay_api_FailedVerification6() {
        return (int)23L;
    }
    public static int sdrplay_api_InvalidServiceVersion() {
        return (int)24L;
    }
    public static int sdrplay_api_Update_None() {
        return (int)0L;
    }
    public static int sdrplay_api_Update_Dev_Fs() {
        return (int)1L;
    }
    public static int sdrplay_api_Update_Dev_Ppm() {
        return (int)2L;
    }
    public static int sdrplay_api_Update_Dev_SyncUpdate() {
        return (int)4L;
    }
    public static int sdrplay_api_Update_Dev_ResetFlags() {
        return (int)8L;
    }
    public static int sdrplay_api_Update_Rsp1a_BiasTControl() {
        return (int)16L;
    }
    public static int sdrplay_api_Update_Rsp1a_RfNotchControl() {
        return (int)32L;
    }
    public static int sdrplay_api_Update_Rsp1a_RfDabNotchControl() {
        return (int)64L;
    }
    public static int sdrplay_api_Update_Rsp2_BiasTControl() {
        return (int)128L;
    }
    public static int sdrplay_api_Update_Rsp2_AmPortSelect() {
        return (int)256L;
    }
    public static int sdrplay_api_Update_Rsp2_AntennaControl() {
        return (int)512L;
    }
    public static int sdrplay_api_Update_Rsp2_RfNotchControl() {
        return (int)1024L;
    }
    public static int sdrplay_api_Update_Rsp2_ExtRefControl() {
        return (int)2048L;
    }
    public static int sdrplay_api_Update_RspDuo_ExtRefControl() {
        return (int)4096L;
    }
    public static int sdrplay_api_Update_Master_Spare_1() {
        return (int)8192L;
    }
    public static int sdrplay_api_Update_Master_Spare_2() {
        return (int)16384L;
    }
    public static int sdrplay_api_Update_Tuner_Gr() {
        return (int)32768L;
    }
    public static int sdrplay_api_Update_Tuner_GrLimits() {
        return (int)65536L;
    }
    public static int sdrplay_api_Update_Tuner_Frf() {
        return (int)131072L;
    }
    public static int sdrplay_api_Update_Tuner_BwType() {
        return (int)262144L;
    }
    public static int sdrplay_api_Update_Tuner_IfType() {
        return (int)524288L;
    }
    public static int sdrplay_api_Update_Tuner_DcOffset() {
        return (int)1048576L;
    }
    public static int sdrplay_api_Update_Tuner_LoMode() {
        return (int)2097152L;
    }
    public static int sdrplay_api_Update_Ctrl_DCoffsetIQimbalance() {
        return (int)4194304L;
    }
    public static int sdrplay_api_Update_Ctrl_Decimation() {
        return (int)8388608L;
    }
    public static int sdrplay_api_Update_Ctrl_Agc() {
        return (int)16777216L;
    }
    public static int sdrplay_api_Update_Ctrl_AdsbMode() {
        return (int)33554432L;
    }
    public static int sdrplay_api_Update_Ctrl_OverloadMsgAck() {
        return (int)67108864L;
    }
    public static int sdrplay_api_Update_RspDuo_BiasTControl() {
        return (int)134217728L;
    }
    public static int sdrplay_api_Update_RspDuo_AmPortSelect() {
        return (int)268435456L;
    }
    public static int sdrplay_api_Update_RspDuo_Tuner1AmNotchControl() {
        return (int)536870912L;
    }
    public static int sdrplay_api_Update_RspDuo_RfNotchControl() {
        return (int)1073741824L;
    }
    public static int sdrplay_api_Update_RspDuo_RfDabNotchControl() {
        return (int)-2147483648L;
    }
    public static int sdrplay_api_Update_Ext1_None() {
        return (int)0L;
    }
    public static int sdrplay_api_Update_RspDx_HdrEnable() {
        return (int)1L;
    }
    public static int sdrplay_api_Update_RspDx_BiasTControl() {
        return (int)2L;
    }
    public static int sdrplay_api_Update_RspDx_AntennaControl() {
        return (int)4L;
    }
    public static int sdrplay_api_Update_RspDx_RfNotchControl() {
        return (int)8L;
    }
    public static int sdrplay_api_Update_RspDx_RfDabNotchControl() {
        return (int)16L;
    }
    public static int sdrplay_api_Update_RspDx_HdrBw() {
        return (int)32L;
    }
    public static int sdrplay_api_DbgLvl_Disable() {
        return (int)0L;
    }
    public static int sdrplay_api_DbgLvl_Verbose() {
        return (int)1L;
    }
    public static int sdrplay_api_DbgLvl_Warning() {
        return (int)2L;
    }
    public static int sdrplay_api_DbgLvl_Error() {
        return (int)3L;
    }
    public static int sdrplay_api_DbgLvl_Message() {
        return (int)4L;
    }
    public static MethodHandle sdrplay_api_Open$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_Open$MH,"sdrplay_api_Open");
    }
    public static int sdrplay_api_Open () {
        var mh$ = sdrplay_api_Open$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_Close$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_Close$MH,"sdrplay_api_Close");
    }
    public static int sdrplay_api_Close () {
        var mh$ = sdrplay_api_Close$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_ApiVersion$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_ApiVersion$MH,"sdrplay_api_ApiVersion");
    }
    public static int sdrplay_api_ApiVersion ( Addressable apiVer) {
        var mh$ = sdrplay_api_ApiVersion$MH();
        try {
            return (int)mh$.invokeExact(apiVer);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_LockDeviceApi$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_LockDeviceApi$MH,"sdrplay_api_LockDeviceApi");
    }
    public static int sdrplay_api_LockDeviceApi () {
        var mh$ = sdrplay_api_LockDeviceApi$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_UnlockDeviceApi$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_UnlockDeviceApi$MH,"sdrplay_api_UnlockDeviceApi");
    }
    public static int sdrplay_api_UnlockDeviceApi () {
        var mh$ = sdrplay_api_UnlockDeviceApi$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_GetDevices$MH() {
        return RuntimeHelper.requireNonNull(constants$7.sdrplay_api_GetDevices$MH,"sdrplay_api_GetDevices");
    }
    public static int sdrplay_api_GetDevices ( Addressable devices,  Addressable numDevs,  int maxDevs) {
        var mh$ = sdrplay_api_GetDevices$MH();
        try {
            return (int)mh$.invokeExact(devices, numDevs, maxDevs);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_SelectDevice$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_SelectDevice$MH,"sdrplay_api_SelectDevice");
    }
    public static int sdrplay_api_SelectDevice ( Addressable device) {
        var mh$ = sdrplay_api_SelectDevice$MH();
        try {
            return (int)mh$.invokeExact(device);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_ReleaseDevice$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_ReleaseDevice$MH,"sdrplay_api_ReleaseDevice");
    }
    public static int sdrplay_api_ReleaseDevice ( Addressable device) {
        var mh$ = sdrplay_api_ReleaseDevice$MH();
        try {
            return (int)mh$.invokeExact(device);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_GetErrorString$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_GetErrorString$MH,"sdrplay_api_GetErrorString");
    }
    public static MemoryAddress sdrplay_api_GetErrorString ( int err) {
        var mh$ = sdrplay_api_GetErrorString$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(err);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_GetLastError$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_GetLastError$MH,"sdrplay_api_GetLastError");
    }
    public static MemoryAddress sdrplay_api_GetLastError ( Addressable device) {
        var mh$ = sdrplay_api_GetLastError$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(device);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_DisableHeartbeat$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_DisableHeartbeat$MH,"sdrplay_api_DisableHeartbeat");
    }
    public static int sdrplay_api_DisableHeartbeat () {
        var mh$ = sdrplay_api_DisableHeartbeat$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_DebugEnable$MH() {
        return RuntimeHelper.requireNonNull(constants$8.sdrplay_api_DebugEnable$MH,"sdrplay_api_DebugEnable");
    }
    public static int sdrplay_api_DebugEnable ( Addressable dev,  int enable) {
        var mh$ = sdrplay_api_DebugEnable$MH();
        try {
            return (int)mh$.invokeExact(dev, enable);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_GetDeviceParams$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_GetDeviceParams$MH,"sdrplay_api_GetDeviceParams");
    }
    public static int sdrplay_api_GetDeviceParams ( Addressable dev,  Addressable deviceParams) {
        var mh$ = sdrplay_api_GetDeviceParams$MH();
        try {
            return (int)mh$.invokeExact(dev, deviceParams);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_Init$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_Init$MH,"sdrplay_api_Init");
    }
    public static int sdrplay_api_Init ( Addressable dev,  Addressable callbackFns,  Addressable cbContext) {
        var mh$ = sdrplay_api_Init$MH();
        try {
            return (int)mh$.invokeExact(dev, callbackFns, cbContext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_Uninit$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_Uninit$MH,"sdrplay_api_Uninit");
    }
    public static int sdrplay_api_Uninit ( Addressable dev) {
        var mh$ = sdrplay_api_Uninit$MH();
        try {
            return (int)mh$.invokeExact(dev);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_Update$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_Update$MH,"sdrplay_api_Update");
    }
    public static int sdrplay_api_Update ( Addressable dev,  int tuner,  int reasonForUpdate,  int reasonForUpdateExt1) {
        var mh$ = sdrplay_api_Update$MH();
        try {
            return (int)mh$.invokeExact(dev, tuner, reasonForUpdate, reasonForUpdateExt1);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_SwapRspDuoActiveTuner$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_SwapRspDuoActiveTuner$MH,"sdrplay_api_SwapRspDuoActiveTuner");
    }
    public static int sdrplay_api_SwapRspDuoActiveTuner ( Addressable dev,  Addressable currentTuner,  int tuner1AmPortSel) {
        var mh$ = sdrplay_api_SwapRspDuoActiveTuner$MH();
        try {
            return (int)mh$.invokeExact(dev, currentTuner, tuner1AmPortSel);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_SwapRspDuoDualTunerModeSampleRate$MH() {
        return RuntimeHelper.requireNonNull(constants$9.sdrplay_api_SwapRspDuoDualTunerModeSampleRate$MH,"sdrplay_api_SwapRspDuoDualTunerModeSampleRate");
    }
    public static int sdrplay_api_SwapRspDuoDualTunerModeSampleRate ( Addressable dev,  Addressable currentSampleRate,  double newSampleRate) {
        var mh$ = sdrplay_api_SwapRspDuoDualTunerModeSampleRate$MH();
        try {
            return (int)mh$.invokeExact(dev, currentSampleRate, newSampleRate);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle sdrplay_api_SwapRspDuoMode$MH() {
        return RuntimeHelper.requireNonNull(constants$10.sdrplay_api_SwapRspDuoMode$MH,"sdrplay_api_SwapRspDuoMode");
    }
    public static int sdrplay_api_SwapRspDuoMode ( Addressable currDevice,  Addressable deviceParams,  int rspDuoMode,  double sampleRate,  int tuner,  int bwType,  int ifType,  int tuner1AmPortSel) {
        var mh$ = sdrplay_api_SwapRspDuoMode$MH();
        try {
            return (int)mh$.invokeExact(currDevice, deviceParams, rspDuoMode, sampleRate, tuner, bwType, ifType, tuner1AmPortSel);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static int MAX_BB_GR() {
        return (int)59L;
    }
    public static float SDRPLAY_API_VERSION() {
        return 3.08f;
    }
    public static int SDRPLAY_MAX_DEVICES() {
        return (int)16L;
    }
    public static int SDRPLAY_MAX_TUNERS_PER_DEVICE() {
        return (int)2L;
    }
    public static int SDRPLAY_MAX_SER_NO_LEN() {
        return (int)64L;
    }
    public static int SDRPLAY_MAX_ROOT_NM_LEN() {
        return (int)32L;
    }
    public static int SDRPLAY_RSP1_ID() {
        return (int)1L;
    }
    public static int SDRPLAY_RSP1A_ID() {
        return (int)255L;
    }
    public static int SDRPLAY_RSP2_ID() {
        return (int)2L;
    }
    public static int SDRPLAY_RSPduo_ID() {
        return (int)3L;
    }
    public static int SDRPLAY_RSPdx_ID() {
        return (int)4L;
    }
}


