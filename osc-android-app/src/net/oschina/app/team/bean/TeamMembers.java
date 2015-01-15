package net.oschina.app.team.bean;

import java.util.ArrayList;
import java.util.List;

import net.oschina.app.bean.Entity;
import net.oschina.app.bean.ListEntity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Team成员列表
 * 
 * @author kymjs
 * 
 */
@XStreamAlias("members")
public class TeamMembers extends Entity implements ListEntity {

    private static final long serialVersionUID = 1L;

    @XStreamAlias("member")
    private List<TeamMember> list = new ArrayList<TeamMember>();

    public void setList(List<TeamMember> list) {
        this.list = list;
    }

    @Override
    public List<TeamMember> getList() {
        return list;
    }

}
