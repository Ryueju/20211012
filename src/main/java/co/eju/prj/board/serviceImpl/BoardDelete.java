package co.eju.prj.board.serviceImpl;




import co.eju.prj.board.service.BoardVO;
import co.eju.prj.comm.Command;

public class BoardDelete implements Command {

	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("삭제할 글 번호를 입력하세요>>");
			vo.setBId(sc.nextInt());
			int n = dao.boardDelete(vo);
			if (n!=0) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("삭제 실패..");
			}
	}

}
