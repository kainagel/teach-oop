package cc_klassen.zzConfigSandbox;

class Config{
	private ControlerConfig controlerConfig = new ControlerConfig();
	private NetworkConfig networkConfig = new NetworkConfig();
	private PlansConfig plansConfig = new PlansConfig();

	public ControlerConfig controller(){
		return controlerConfig;
	}
//	public void setControlerConfig( ControlerConfig controlerConfig ){
//		this.controlerConfig = controlerConfig;
//	}
	public NetworkConfig network(){
		return networkConfig;
	}
//	public void setNetworkConfig( NetworkConfig networkConfig ){
//		this.networkConfig = networkConfig;
//	}
	public PlansConfig plans(){
		return plansConfig;
	}
//	public void setPlansConfig( PlansConfig plansConfig ){
//		this.plansConfig = plansConfig;
//	}
}
