.class public final LR4/D2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lcom/web2native/MainActivity;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:[B


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;Ljava/lang/String;[BLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/D2;->q:Lcom/web2native/MainActivity;

    .line 2
    .line 3
    iput-object p2, p0, LR4/D2;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LR4/D2;->s:[B

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LR4/D2;

    .line 2
    .line 3
    iget-object v0, p0, LR4/D2;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LR4/D2;->s:[B

    .line 6
    .line 7
    iget-object v2, p0, LR4/D2;->q:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LR4/D2;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;[BLq5/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LR4/D2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/D2;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/D2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 5
    .line 6
    iget-object v0, p0, LR4/D2;->q:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LR4/D2;->r:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/io/FileOutputStream;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LR4/D2;->s:[B

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method
