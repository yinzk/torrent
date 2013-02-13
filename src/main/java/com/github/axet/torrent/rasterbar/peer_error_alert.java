package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:419</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class peer_error_alert extends Structure {
	/// C type : peer_alert
	public peer_alert peer_alert;
	/// C type : error_code
	public error_code error;
	public peer_error_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"peer_alert", "error"});
	}
	/**
	 * @param peer_alert C type : peer_alert<br>
	 * @param error C type : error_code
	 */
	public peer_error_alert(peer_alert peer_alert, error_code error) {
		super();
		this.peer_alert = peer_alert;
		this.error = error;
	}
	public static class ByReference extends peer_error_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends peer_error_alert implements Structure.ByValue {
		
	};
}