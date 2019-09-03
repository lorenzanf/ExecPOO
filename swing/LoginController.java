package swing;

public class LoginController {
	private  String login;
	private  String senha="Semana2";
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int Login(String senha){
		if(this.senha.equals(senha))return 1;
		else
		return 0;
		
	}
}
