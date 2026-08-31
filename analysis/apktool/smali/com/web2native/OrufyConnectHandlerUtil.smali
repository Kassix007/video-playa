.class public final Lcom/web2native/OrufyConnectHandlerUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>(LR4/k1;)V
    .locals 1

    .line 1
    const-string v0, "dataObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getUnreadChatsCount()V
    .locals 0

    return-void
.end method

.method public final getUser()V
    .locals 0

    return-void
.end method

.method public final isInitializationDone()V
    .locals 0

    return-void
.end method

.method public final isUserLoggedIn()V
    .locals 0

    return-void
.end method

.method public final login(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final logout()V
    .locals 0

    return-void
.end method

.method public final matchUrl(LR4/k1;Ljava/lang/String;)Z
    .locals 0

    .line 1
    const-string p2, "dataObject"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final onUnreadChatCountsChange()V
    .locals 0

    return-void
.end method

.method public final sendChatMessage(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final setAppId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "appId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setExternalUserid(Ljava/lang/String;)V
    .locals 1

    const-string v0, "externalUserId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setFcmToken(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setUser(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final setUserDetails(Ljava/lang/String;)V
    .locals 1

    const-string v0, "jsString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setWidgetConfig(Ljava/lang/String;)V
    .locals 1

    const-string v0, "jsString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final showConversation(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final widgetLogin(Ljava/lang/String;)V
    .locals 1

    const-string v0, "jsString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final widgetLogout()V
    .locals 0

    return-void
.end method
