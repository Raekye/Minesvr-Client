package com.creatifcubed.minesvr.models;

import java.util.Date;

class Snapshot(val timestamp: Date, val name: String, val hasSynced: Boolean, val onServer: Boolean, val version: SemVer) {
	
}
