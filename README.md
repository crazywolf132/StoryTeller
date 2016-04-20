#WELCOME TO STORY TELLER APP.

##THIS PROJECT HAS BEEN MOVED TO GITLAB: http://gitpull.xyz
If you need any help, email: crazywolf132@gmail.com

This is how to set-it up with intellij:

Open intellij -> Settings -> Plugins -> Browse repositories -> type: Gitlab Projects.

After installed:

    Settings -> Other Settings -> Gitlab Settings.
    (What to fill in)
    Gitlab server url: http://gitpull.xyz
    Gitlab api key: *READ BELOW*
    Create an ssh key so you can push and pull to gitlab. *READ BELOW*
    Make sure you are in the group "Story Teller".
    go to: VCS -> Check out version control -> Gitlab
    From the drop down menu that shows up, always choose https://gitpull.xyz/*****.git

HOW TO GET THE API KEY.

    private token which is shown as first thing on https://gitpull.xyz/profile/account

HOW TO GET THE SSH KEY.

    WINDOWS: 
            Check for pre-made ssh-key: type %userprofile%\.ssh\id_rsa.pub
            Make one: Use gitshell -> ssh-keygen -t rsa -C "$your_email"
            
    MAC/LINUX:
            Check for pre-made ssh-key: cat ~/.ssh/id_rsa.pub
            Make one: ssh-keygen -t rsa -C "$your_email"
            
    Once you have got the key, paste it into the box then click ok.
