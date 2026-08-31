.class public final LR4/C2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/C2;->r:Ljava/lang/String;

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
    new-instance p1, LR4/C2;

    .line 2
    .line 3
    iget-object v0, p0, LR4/C2;->r:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LR4/C2;-><init>(Ljava/lang/String;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LR4/C2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/C2;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/C2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LR4/C2;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :try_start_1
    new-instance p1, Ljava/net/URL;

    .line 27
    .line 28
    iget-object v0, p0, LR4/C2;->r:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, LM5/H;->a:LT5/e;

    .line 34
    .line 35
    sget-object v0, LT5/d;->q:LT5/d;

    .line 36
    .line 37
    new-instance v3, LR4/B2;

    .line 38
    .line 39
    invoke-direct {v3, p1, v2}, LR4/B2;-><init>(Ljava/net/URL;Lq5/c;)V

    .line 40
    .line 41
    .line 42
    iput v1, p0, LR4/C2;->q:I

    .line 43
    .line 44
    invoke-static {v0, v3, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 49
    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    :goto_0
    :try_start_2
    const-string v0, "withContext(...)"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast p1, Ljava/io/InputStream;

    .line 59
    .line 60
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0x400

    .line 66
    .line 67
    new-array v1, v1, [B

    .line 68
    .line 69
    :goto_1
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/4 v4, -0x1

    .line 74
    if-eq v3, v4, :cond_3

    .line 75
    .line 76
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 77
    .line 78
    invoke-virtual {v4, v1}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-virtual {v0, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    return-object v2
.end method
