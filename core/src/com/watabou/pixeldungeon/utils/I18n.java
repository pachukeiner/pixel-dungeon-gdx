package com.watabou.pixeldungeon.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.I18NBundle;
import com.watabou.pixeldungeon.Assets;

public final class I18n {
	
	static FileHandle i18nFile;
	static I18NBundle i18nBundle;
	
	public static void load() {
		i18nFile = Gdx.files.internal(Assets.I18N_FILE);
		i18nBundle = I18NBundle.createBundle(i18nFile);
	}
	
	public static String get(String key)
	{
		try
		{
			return i18nBundle.get(key);
		}
		catch (Exception e){
			return "";
		}
		
	}
}
