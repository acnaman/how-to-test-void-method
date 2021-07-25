package howtotestvoidmethod;

/**
 * スイッチクラス。スイッチはオン・オフを切り替えることができる。
 */
public class Switch {
	
	/** オン・オフの内部状態 */
	private SwitchStatus status;
	
	public Switch() {
		this.status = SwitchStatus.OFF;
	}

	/**
	 * スイッチをオンにする。
	 */
	public void turnOn() {
		this.status = SwitchStatus.ON;
	}
	
	/**
	 * スイッチの状態の表示名を返却する。
	 * 
	 * @return スイッチがオンなら「オン」、そうでないなら「オフ」
	 */
	public String displayName() {
		if(this.status == SwitchStatus.ON) {
			return "オン";			
		}
		return "オフ";
	}
	
	/**
	 * オン・オフの内部状態を返却する。
	 * 
	 * @return オン・オフの内部状態。
	 */
	SwitchStatus getStatus() {
		return status;
	}
}
