.class public final LR4/o0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/s0;

.field public final synthetic r:[B

.field public final synthetic s:Lkotlin/jvm/internal/y;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:[Ljava/lang/String;


# direct methods
.method public constructor <init>(LR4/s0;[BLkotlin/jvm/internal/y;Ljava/lang/String;[Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/o0;->q:LR4/s0;

    .line 2
    .line 3
    iput-object p2, p0, LR4/o0;->r:[B

    .line 4
    .line 5
    iput-object p3, p0, LR4/o0;->s:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iput-object p4, p0, LR4/o0;->t:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, LR4/o0;->u:[Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, LR4/o0;

    .line 2
    .line 3
    iget-object v4, p0, LR4/o0;->t:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, LR4/o0;->u:[Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, LR4/o0;->q:LR4/s0;

    .line 8
    .line 9
    iget-object v2, p0, LR4/o0;->r:[B

    .line 10
    .line 11
    iget-object v3, p0, LR4/o0;->s:Lkotlin/jvm/internal/y;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LR4/o0;-><init>(LR4/s0;[BLkotlin/jvm/internal/y;Ljava/lang/String;[Ljava/lang/String;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    invoke-virtual {p0, p1, p2}, LR4/o0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/o0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, LR4/o0;->u:[Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    iget-object v2, p0, LR4/o0;->q:LR4/s0;

    .line 11
    .line 12
    iget-object v3, p0, LR4/o0;->s:Lkotlin/jvm/internal/y;

    .line 13
    .line 14
    if-ne p1, v1, :cond_1

    .line 15
    .line 16
    :try_start_1
    iget-object p1, v2, LR4/s0;->b:LR4/k1;

    .line 17
    .line 18
    iget-object p1, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 19
    .line 20
    iget-object v5, p0, LR4/o0;->r:[B

    .line 21
    .line 22
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, v0

    .line 25
    check-cast v6, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, LR4/o0;->t:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const-string v0, "*/*"

    .line 32
    .line 33
    :cond_0
    move-object v7, v0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_2

    .line 38
    :goto_0
    const/4 v8, 0x2

    .line 39
    const/4 v4, 0x0

    .line 40
    move-object v3, p1

    .line 41
    invoke-static/range {v2 .. v8}, LR4/s0;->e(LR4/s0;Lcom/web2native/MainActivity;Ljava/io/InputStream;[BLjava/lang/String;Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    const/16 v1, 0x1a

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    if-lt p1, v1, :cond_2

    .line 49
    .line 50
    iget-object p1, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, p1}, LR4/s0;->b(Ljava/lang/String;)Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, LC0/U;->k(Ljava/io/File;)Ljava/nio/file/Path;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-array v1, v4, [Ljava/nio/file/OpenOption;

    .line 63
    .line 64
    invoke-static {p1, v1}, LC0/U;->i(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance p1, Ljava/io/FileOutputStream;

    .line 73
    .line 74
    iget-object v1, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, LR4/s0;->b(Ljava/lang/String;)Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    iget-object v1, p0, LR4/o0;->r:[B

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 88
    .line 89
    .line 90
    aget-object v1, v0, v4

    .line 91
    .line 92
    const-string v5, "png"

    .line 93
    .line 94
    invoke-static {v1, v5}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_3

    .line 99
    .line 100
    aget-object v0, v0, v4

    .line 101
    .line 102
    const-string v1, "jpg"

    .line 103
    .line 104
    invoke-static {v0, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    :cond_3
    iget-object v0, v3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v0}, LR4/s0;->b(Ljava/lang/String;)Ljava/io/File;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v1, "getPath(...)"

    .line 123
    .line 124
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v2, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 128
    .line 129
    filled-new-array {v0}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v2, LR4/l0;

    .line 134
    .line 135
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-static {v1, v0, v3, v2}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 147
    .line 148
    .line 149
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 150
    .line 151
    return-object p1
.end method
