package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RetornaEncLocal {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// retornaEncLocal
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var encLocal = Var.VAR_NULL;

			public Var call() throws Exception {
				encLocal = cronapi.list.Operations.newList(
						cronapi.list.Operations.orderListAlphabeticGrowing(
								cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
										Var.valueOf(
												"select u.name from User u where u.tpMinisterio.nome = \'Enc. Local\'   order by u.name asc"))),
						Var.VAR_NULL, Var.VAR_NULL);
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("User.active.name"), encLocal);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
