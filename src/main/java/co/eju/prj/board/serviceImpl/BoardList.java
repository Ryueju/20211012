package co.eju.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.eju.prj.board.service.BoardService;
import co.eju.prj.board.service.BoardVO;
import co.eju.prj.comm.Command;

public class BoardList implements Command {
	private BoardService boardService = new BoardServiceImpl();
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
			List<BoardVO> boards = new ArrayList<BoardVO>();
			boards = boardService.boardSelectList();
			
			System.out.println("======공지사항 목록========");
			for(BoardVO vo : boards) {
				System.out.print(vo.getBId() + " : ");
				System.out.print(vo.getBWriter() + " : ");
				System.out.print(vo.getBWriteDate() + " : ");
				System.out.print(vo.getBTitle() + " : ");
				System.out.println(vo.getBHit() + " : ");
			
				//contents는 나중에해도되용
			}
			System.out.println("======공지사항 끝========");
	}

}
