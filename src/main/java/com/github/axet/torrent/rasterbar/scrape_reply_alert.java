package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:386</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class scrape_reply_alert extends Structure {
	/// C type : tracker_alert
	public tracker_alert tracker_alert;
	public int incomplete;
	public int complete;
	public scrape_reply_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"tracker_alert", "incomplete", "complete"});
	}
	/// @param tracker_alert C type : tracker_alert
	public scrape_reply_alert(tracker_alert tracker_alert, int incomplete, int complete) {
		super();
		this.tracker_alert = tracker_alert;
		this.incomplete = incomplete;
		this.complete = complete;
	}
	public static class ByReference extends scrape_reply_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends scrape_reply_alert implements Structure.ByValue {
		
	};
}