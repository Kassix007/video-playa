.class public final Lh6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/o;


# static fields
.field public static final a:Lh6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh6/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh6/a;->a:Lh6/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Li6/f;)Ld6/u;
    .locals 9

    .line 1
    iget-object v1, p1, Li6/f;->a:Lh6/h;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-boolean v0, v1, Lh6/h;->B:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, v1, Lh6/h;->A:Z

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iget-boolean v0, v1, Lh6/h;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    monitor-exit v1

    .line 17
    iget-object v2, v1, Lh6/h;->w:Lh6/d;

    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v1, Lh6/h;->q:Ld6/q;

    .line 23
    .line 24
    :try_start_1
    iget v3, p1, Li6/f;->f:I

    .line 25
    .line 26
    iget v4, p1, Li6/f;->g:I

    .line 27
    .line 28
    iget v5, p1, Li6/f;->h:I

    .line 29
    .line 30
    iget-boolean v6, v0, Ld6/q;->v:Z

    .line 31
    .line 32
    iget-object v7, p1, Li6/f;->e:Ld6/s;

    .line 33
    .line 34
    iget-object v7, v7, Ld6/s;->b:Ljava/lang/String;

    .line 35
    .line 36
    const-string v8, "GET"

    .line 37
    .line 38
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x1

    .line 43
    xor-int/2addr v7, v8

    .line 44
    invoke-virtual/range {v2 .. v7}, Lh6/d;->a(IIIZZ)Lh6/j;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3, v0, p1}, Lh6/j;->j(Ld6/q;Li6/f;)Li6/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_1
    .catch Lh6/k; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    new-instance v3, LL/s;

    .line 53
    .line 54
    const-string v4, "finder"

    .line 55
    .line 56
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, v3, LL/s;->b:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v2, v3, LL/s;->c:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v0, v3, LL/s;->d:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {v0}, Li6/d;->g()Lh6/j;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, v3, LL/s;->e:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v3, v1, Lh6/h;->y:LL/s;

    .line 75
    .line 76
    iput-object v3, v1, Lh6/h;->D:LL/s;

    .line 77
    .line 78
    monitor-enter v1

    .line 79
    :try_start_2
    iput-boolean v8, v1, Lh6/h;->z:Z

    .line 80
    .line 81
    iput-boolean v8, v1, Lh6/h;->A:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    .line 83
    monitor-exit v1

    .line 84
    iget-boolean v0, v1, Lh6/h;->C:Z

    .line 85
    .line 86
    if-nez v0, :cond_0

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    const/16 v1, 0x3d

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-static {p1, v2, v3, v0, v1}, Li6/f;->a(Li6/f;ILL/s;Ld6/s;I)Li6/f;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object p1, p1, Li6/f;->e:Ld6/s;

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Li6/f;->b(Ld6/s;)Ld6/u;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 104
    .line 105
    const-string v0, "Canceled"

    .line 106
    .line 107
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object p1, v0

    .line 113
    monitor-exit v1

    .line 114
    throw p1

    .line 115
    :catch_0
    move-exception v0

    .line 116
    move-object p1, v0

    .line 117
    goto :goto_0

    .line 118
    :catch_1
    move-exception v0

    .line 119
    move-object p1, v0

    .line 120
    goto :goto_1

    .line 121
    :goto_0
    invoke-virtual {v2, p1}, Lh6/d;->c(Ljava/io/IOException;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Lh6/k;

    .line 125
    .line 126
    invoke-direct {v0, p1}, Lh6/k;-><init>(Ljava/io/IOException;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :goto_1
    iget-object v0, p1, Lh6/k;->r:Ljava/io/IOException;

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Lh6/d;->c(Ljava/io/IOException;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    .line 137
    .line 138
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    move-object p1, v0

    .line 146
    goto :goto_2

    .line 147
    :cond_2
    const-string p1, "Check failed."

    .line 148
    .line 149
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_3
    const-string p1, "released"

    .line 156
    .line 157
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    :goto_2
    monitor-exit v1

    .line 164
    throw p1
.end method
