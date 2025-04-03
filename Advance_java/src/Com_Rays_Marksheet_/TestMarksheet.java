package Com_Rays_Marksheet_;

import java.util.Iterator;
import java.util.List;

import Com_Rays_Dynamic.StudentBean;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		// testAdd();
		// testUpdate();
		// testDelete();
		//testFindBy();
		 testSearch();

	}

	public static void testAdd() throws Exception {

		StudentBean bean = new StudentBean();
		bean.setId(55);
		bean.setName("kha");
		bean.setRollNo(210);
		bean.setPhysics(61);
		bean.setChemistry(72);
		bean.setMaths(49);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		StudentBean bean = new StudentBean();
		bean.setId(55);
		bean.setName("farhan");
		bean.setRollNo(205);
		bean.setPhysics(67);
		bean.setChemistry(45);
		bean.setMaths(89);
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
	}

	public static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();
		model.delete(55);
	}

	public static void testFindBy() throws Exception {

		MarksheetModel model = new MarksheetModel();

		StudentBean bean = model.findByPk(3);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		} else {
			System.out.println("id not found");
		}
	}

	public static void testSearch() throws Exception {
		StudentBean bean = new StudentBean();

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean, 7, 2);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (StudentBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}
	}
}