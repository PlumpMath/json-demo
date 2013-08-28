package cn.sh.sbl.json.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String json = "{\"page\":\"1\",\"total\":2,\"records\":\"13\",\"rows\":[{\"id\":\"1\",\"invdate\":\"2007-10-01\",\"name\":\"Client 1\",\"amount\":\"100.00\",\"tax\":\"20.00\",\"total\":\"120.00\",\"note\":\"note 1\"},{\"id\":\"2\",\"invdate\":\"2007-10-03\",\"name\":\"Client 1\",\"amount\":\"200.00\",\"tax\":\"40.00\",\"total\":\"240.00\",\"note\":\"note 2\"},{\"id\":\"3\",\"invdate\":\"2007-10-02\",\"name\":\"Client 2\",\"amount\":\"300.00\",\"tax\":\"60.00\",\"total\":\"360.00\",\"note\":\"note invoice 3 & and amp test\"},{\"id\":\"4\",\"invdate\":\"2007-10-04\",\"name\":\"Client 3\",\"amount\":\"150.00\",\"tax\":\"0.00\",\"total\":\"150.00\",\"note\":\"no tax\"},{\"id\":\"5\",\"invdate\":\"2007-10-05\",\"name\":\"Client 3\",\"amount\":\"100.00\",\"tax\":\"0.00\",\"total\":\"100.00\",\"note\":\"no tax at all\"},{\"id\":\"6\",\"invdate\":\"2007-10-05\",\"name\":\"Client 1\",\"amount\":\"50.00\",\"tax\":\"10.00\",\"total\":\"60.00\",\"note\":\"\"},{\"id\":\"7\",\"invdate\":\"2007-10-05\",\"name\":\"Client 2\",\"amount\":\"120.00\",\"tax\":\"12.00\",\"total\":\"134.00\",\"note\":null},{\"id\":\"8\",\"invdate\":\"2007-10-06\",\"name\":\"Client 3\",\"amount\":\"200.00\",\"tax\":\"0.00\",\"total\":\"200.00\",\"note\":null},{\"id\":\"9\",\"invdate\":\"2007-10-06\",\"name\":\"Client 1\",\"amount\":\"200.00\",\"tax\":\"40.00\",\"total\":\"240.00\",\"note\":null},{\"id\":\"10\",\"invdate\":\"2007-10-06\",\"name\":\"Client 2\",\"amount\":\"100.00\",\"tax\":\"20.00\",\"total\":\"120.00\",\"note\":null}]}";
		PrintWriter out = resp.getWriter();
		out.write(json);
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
}
