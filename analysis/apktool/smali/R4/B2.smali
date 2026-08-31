.class public final LR4/B2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/B2;->q:Ljava/net/URL;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, LR4/B2;

    .line 2
    .line 3
    iget-object v0, p0, LR4/B2;->q:Ljava/net/URL;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LR4/B2;-><init>(Ljava/net/URL;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LR4/B2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/B2;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/B2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LR4/B2;->q:Ljava/net/URL;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    const-string v0, "Content-Disposition"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LR4/V;->c:Ljava/lang/String;

    .line 24
    .line 25
    const/16 v0, 0x2710

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "GET"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method
