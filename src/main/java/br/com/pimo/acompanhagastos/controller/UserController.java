package br.com.pimo.acompanhagastos.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class UserController {
	
	@Inject
	private Result result;
	
	public UserController() {
	}

	@Get
	@Path("/user")
	public void test() {
		result.use(Results.json())
			.withoutRoot()
			.from("aeeeeeeeeeeeee")
			.serialize();
	}

}
