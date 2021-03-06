package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:295</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class peer_request extends Structure {
	public int piece;
	public int start;
	public int length;
	public peer_request() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"piece", "start", "length"});
	}
	public peer_request(int piece, int start, int length) {
		super();
		this.piece = piece;
		this.start = start;
		this.length = length;
	}
	public static class ByReference extends peer_request implements Structure.ByReference {
		
	};
	public static class ByValue extends peer_request implements Structure.ByValue {
		
	};
}
