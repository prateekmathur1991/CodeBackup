package com.koldbyte.codebackup.plugins;

import java.util.List;

import com.koldbyte.codebackup.core.entities.Submission;
import com.koldbyte.codebackup.core.entities.User;

public interface PluginInterface {
	public List<Submission> getSolvedList(User user);
}
