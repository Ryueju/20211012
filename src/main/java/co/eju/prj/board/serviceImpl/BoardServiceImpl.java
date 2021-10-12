package co.eju.prj.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.eju.prj.board.service.BoardMapper;
import co.eju.prj.board.service.BoardService;
import co.eju.prj.board.service.BoardVO;
import co.eju.prj.comm.DataSource;

public class BoardServiceImpl implements BoardService {

	private SqlSession sqlSession = DataSource.getInstance().openSession(true); //you can insert true or false
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class);			//true : auto commit
	@Override
	public List<BoardVO> boardSelectList() {
		
//		return sqlSession.selectList("boardSelectList");
		return map.boardSelectList();
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
//		return sqlSession.selectOne("boardSelect");
		return map.boardSelect(vo);
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardInsert(vo);
	}

	@Override
	public  int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardDelete(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardUpdate(vo);
	}
	private void hitUpdate(int id) {
		
	}

	@Override
	public int boardDelete() {
		// TODO Auto-generated method stub
		return 0;
	}
}
