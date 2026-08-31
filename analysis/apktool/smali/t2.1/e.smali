.class public final Lt2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/f;
.implements Lz4/c;


# instance fields
.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/e;->q:Ljava/lang/Object;

    iput-object p2, p0, Lt2/e;->r:Ljava/lang/Object;

    iput-object p3, p0, Lt2/e;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt2/e;->s:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lt2/e;->q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ClipDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public f(Lv0/f;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lt2/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv0/r;

    .line 4
    .line 5
    iget-object v1, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v4

    .line 16
    :goto_0
    sget-object v6, Lv0/p;->r:Lv0/p;

    .line 17
    .line 18
    const-string v7, "layoutCoordinates not set"

    .line 19
    .line 20
    const-wide/16 v8, 0x0

    .line 21
    .line 22
    const/4 v10, 0x1

    .line 23
    if-ge v5, v3, :cond_3

    .line 24
    .line 25
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v11

    .line 29
    check-cast v11, Lv0/l;

    .line 30
    .line 31
    invoke-virtual {v11}, Lv0/l;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    if-eqz v11, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lv0/p;

    .line 40
    .line 41
    if-ne v1, v6, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lt2/e;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lz0/m;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-interface {v1, v8, v9}, Lz0/m;->F(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    new-instance v3, Lv0/q;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct {v3, v0, v4}, Lv0/q;-><init>(Lv0/r;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v1, v2, v3, v10}, Lv0/v;->g(Lv0/f;JLB5/c;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    :goto_1
    sget-object p1, Lv0/p;->s:Lv0/p;

    .line 70
    .line 71
    iput-object p1, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iget-object v3, p0, Lt2/e;->q:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lz0/m;

    .line 80
    .line 81
    if-eqz v3, :cond_7

    .line 82
    .line 83
    invoke-interface {v3, v8, v9}, Lz0/m;->F(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    new-instance v3, Lv/u;

    .line 88
    .line 89
    const/4 v5, 0x2

    .line 90
    invoke-direct {v3, v5, p0, v0}, Lv/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v7, v8, v3, v4}, Lv0/v;->g(Lv0/f;JLB5/c;Z)V

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lv0/p;

    .line 99
    .line 100
    if-ne v3, v6, :cond_6

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    :goto_2
    if-ge v4, v2, :cond_4

    .line 107
    .line 108
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Lv0/l;

    .line 113
    .line 114
    invoke-virtual {v3}, Lv0/l;->a()V

    .line 115
    .line 116
    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    iget-object p1, p1, Lv0/f;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 121
    .line 122
    if-nez p1, :cond_5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    iget-boolean v0, v0, Lv0/r;->s:Z

    .line 126
    .line 127
    xor-int/2addr v0, v10

    .line 128
    iput-boolean v0, p1, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 129
    .line 130
    :cond_6
    :goto_3
    return-void

    .line 131
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1
.end method

.method public zza()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lt2/e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/c;

    .line 4
    .line 5
    invoke-interface {v0}, Lz4/c;->zza()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lt2/e;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lz4/c;

    .line 12
    .line 13
    invoke-interface {v1}, Lz4/c;->zza()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ly4/c;

    .line 18
    .line 19
    iget-object v2, p0, Lt2/e;->s:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Li1/a;

    .line 22
    .line 23
    iget-object v2, v2, Li1/a;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, LC3/b;

    .line 26
    .line 27
    iget-object v2, v2, LC3/b;->a:Landroid/content/Context;

    .line 28
    .line 29
    new-instance v3, Ly4/e;

    .line 30
    .line 31
    check-cast v0, Ly4/j;

    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2}, Ly4/e;-><init>(Ly4/j;Ly4/c;Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    return-object v3
.end method
