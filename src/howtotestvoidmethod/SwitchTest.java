package howtotestvoidmethod;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Switchクラスのテストクラス。
 */
public class SwitchTest {
	Switch _switch;

	@BeforeEach
	public void 前準備() {
		_switch = new Switch();
	}

	// 「1. 副作用の無いテスト容易性を高めるメソッドを追加する」経由のテスト
	@Test
	public void turnOnTest1() {
		// 実行
		_switch.turnOn();
		// 検証
		assertEquals(_switch.getStatus(), SwitchStatus.ON);
	}
	
	// 「2. リフレクションを利用する」経由のテスト
	@Test
	public void turnOnTest2() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// 実行
		_switch.turnOn();
		Field field = _switch.getClass().getDeclaredField("status");
        field.setAccessible(true);
		// 検証
		assertEquals(field.get(_switch), SwitchStatus.ON);
	}

	// 「3. 内部状態によって振る舞いが変わる公開メソッドで観測する」経由のテスト
	@Test
	public void turnOnTest3() {
		// 実行
		_switch.turnOn();
		// 検証
		assertEquals(_switch.displayName(), "オン");
	}
}
