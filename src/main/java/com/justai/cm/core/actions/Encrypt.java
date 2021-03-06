package com.justai.cm.core.actions;

import com.justai.cm.Settings;
import com.justai.cm.core.domain.Cmp;
import com.justai.cm.utils.FileUtils;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.jasypt.util.text.BasicTextEncryptor;

import java.io.FileInputStream;
import java.util.List;

public class Encrypt extends BaseAction {

    @Override
    public void exec(Settings settings, CommandLine commandLine) {

        List<String> args = commandLine.getArgList().subList(1, commandLine.getArgList().size());
        for (String s : args) {
            System.out.println(Encryptor.encrypt(s));
        }
    }

    @Override
    protected void exec0(Cmp cmp) {
        throw new IllegalStateException();
    }

}
