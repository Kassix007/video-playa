.class public final Lv0/A;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements Lv0/o;
.implements LW0/c;
.implements LB0/y0;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public H:LM5/B;

.field public I:Lv0/f;

.field public final J:LR/e;

.field public final K:LR/e;

.field public final L:LR/e;

.field public M:Lv0/f;

.field public N:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/A;->E:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lv0/A;->F:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lv0/A;->G:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 9
    .line 10
    sget-object p1, Lv0/u;->a:Lv0/f;

    .line 11
    .line 12
    iput-object p1, p0, Lv0/A;->I:Lv0/f;

    .line 13
    .line 14
    new-instance p1, LR/e;

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p3, p2, [Lv0/y;

    .line 19
    .line 20
    invoke-direct {p1, p3}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lv0/A;->J:LR/e;

    .line 24
    .line 25
    iput-object p1, p0, Lv0/A;->K:LR/e;

    .line 26
    .line 27
    new-instance p1, LR/e;

    .line 28
    .line 29
    new-array p2, p2, [Lv0/y;

    .line 30
    .line 31
    invoke-direct {p1, p2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lv0/A;->L:LR/e;

    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    iput-wide p1, p0, Lv0/A;->N:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final S()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv0/A;->y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final U()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv0/A;->M:Lv0/f;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v1, v1, Lv0/f;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Lv0/l;

    .line 27
    .line 28
    iget-boolean v5, v5, Lv0/l;->d:Z

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    move-object v4, v1

    .line 42
    check-cast v4, Ljava/util/Collection;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    :goto_1
    if-ge v3, v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lv0/l;

    .line 55
    .line 56
    iget-wide v7, v5, Lv0/l;->a:J

    .line 57
    .line 58
    iget-wide v11, v5, Lv0/l;->c:J

    .line 59
    .line 60
    iget-wide v9, v5, Lv0/l;->b:J

    .line 61
    .line 62
    iget v14, v5, Lv0/l;->e:F

    .line 63
    .line 64
    iget-boolean v6, v5, Lv0/l;->d:Z

    .line 65
    .line 66
    iget v5, v5, Lv0/l;->i:I

    .line 67
    .line 68
    move/from16 v19, v6

    .line 69
    .line 70
    new-instance v6, Lv0/l;

    .line 71
    .line 72
    const/4 v13, 0x0

    .line 73
    const-wide/16 v22, 0x0

    .line 74
    .line 75
    move-wide v15, v9

    .line 76
    move-wide/from16 v17, v11

    .line 77
    .line 78
    move/from16 v20, v19

    .line 79
    .line 80
    move/from16 v21, v5

    .line 81
    .line 82
    invoke-direct/range {v6 .. v23}, Lv0/l;-><init>(JJJZFJJZZIJ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    new-instance v1, Lv0/f;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-direct {v1, v2, v3}, Lv0/f;-><init>(Ljava/util/List;Lcom/google/android/gms/internal/measurement/O1;)V

    .line 95
    .line 96
    .line 97
    iput-object v1, v0, Lv0/A;->I:Lv0/f;

    .line 98
    .line 99
    sget-object v2, Lv0/g;->q:Lv0/g;

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lv0/A;->x0(Lv0/f;Lv0/g;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lv0/g;->r:Lv0/g;

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Lv0/A;->x0(Lv0/f;Lv0/g;)V

    .line 107
    .line 108
    .line 109
    sget-object v2, Lv0/g;->s:Lv0/g;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Lv0/A;->x0(Lv0/f;Lv0/g;)V

    .line 112
    .line 113
    .line 114
    iput-object v3, v0, Lv0/A;->M:Lv0/f;

    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    :goto_2
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv0/A;->y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 6
    .line 7
    invoke-interface {v0}, LW0/c;->b()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final l()F
    .locals 1

    .line 1
    invoke-static {p0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 6
    .line 7
    invoke-interface {v0}, LW0/c;->l()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv0/A;->y0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final t(Lv0/f;Lv0/g;J)V
    .locals 3

    .line 1
    iput-wide p3, p0, Lv0/A;->N:J

    .line 2
    .line 3
    sget-object p3, Lv0/g;->q:Lv0/g;

    .line 4
    .line 5
    if-ne p2, p3, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lv0/A;->I:Lv0/f;

    .line 8
    .line 9
    :cond_0
    iget-object p3, p0, Lv0/A;->H:LM5/B;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lc0/l;->l0()LM5/w;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    new-instance v0, Lv0/z;

    .line 19
    .line 20
    invoke-direct {v0, p0, p4}, Lv0/z;-><init>(Lv0/A;Lq5/c;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, LM5/x;->t:LM5/x;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-static {p3, p4, v1, v0, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, Lv0/A;->H:LM5/B;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2}, Lv0/A;->x0(Lv0/f;Lv0/g;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 36
    .line 37
    move-object p3, p2

    .line 38
    check-cast p3, Ljava/util/Collection;

    .line 39
    .line 40
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    const/4 v0, 0x0

    .line 45
    :goto_0
    if-ge v0, p3, :cond_3

    .line 46
    .line 47
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lv0/l;

    .line 52
    .line 53
    invoke-static {v1}, Lv0/v;->c(Lv0/l;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    move-object p1, p4

    .line 64
    :goto_1
    iput-object p1, p0, Lv0/A;->M:Lv0/f;

    .line 65
    .line 66
    return-void
.end method

.method public final x0(Lv0/f;Lv0/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv0/A;->K:LR/e;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lv0/A;->L:LR/e;

    .line 5
    .line 6
    iget-object v2, p0, Lv0/A;->J:LR/e;

    .line 7
    .line 8
    iget v3, v1, LR/e;->s:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, LR/e;->d(ILR/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget-object v0, p0, Lv0/A;->L:LR/e;

    .line 29
    .line 30
    iget v3, v0, LR/e;->s:I

    .line 31
    .line 32
    sub-int/2addr v3, v2

    .line 33
    iget-object v0, v0, LR/e;->q:[Ljava/lang/Object;

    .line 34
    .line 35
    array-length v2, v0

    .line 36
    if-ge v3, v2, :cond_4

    .line 37
    .line 38
    :goto_0
    if-ltz v3, :cond_4

    .line 39
    .line 40
    aget-object v2, v0, v3

    .line 41
    .line 42
    check-cast v2, Lv0/y;

    .line 43
    .line 44
    iget-object v4, v2, Lv0/y;->t:Lv0/g;

    .line 45
    .line 46
    if-ne p2, v4, :cond_1

    .line 47
    .line 48
    iget-object v4, v2, Lv0/y;->s:LM5/h;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    iput-object v1, v2, Lv0/y;->s:LM5/h;

    .line 53
    .line 54
    invoke-virtual {v4, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    add-int/lit8 v3, v3, -0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    iget-object v0, p0, Lv0/A;->L:LR/e;

    .line 63
    .line 64
    iget-object v2, v0, LR/e;->q:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v0, v0, LR/e;->s:I

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    :goto_1
    if-ge v3, v0, :cond_4

    .line 70
    .line 71
    aget-object v4, v2, v3

    .line 72
    .line 73
    check-cast v4, Lv0/y;

    .line 74
    .line 75
    iget-object v5, v4, Lv0/y;->t:Lv0/g;

    .line 76
    .line 77
    if-ne p2, v5, :cond_3

    .line 78
    .line 79
    iget-object v5, v4, Lv0/y;->s:LM5/h;

    .line 80
    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    iput-object v1, v4, Lv0/y;->s:LM5/h;

    .line 84
    .line 85
    invoke-virtual {v5, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    :goto_2
    iget-object p1, p0, Lv0/A;->L:LR/e;

    .line 92
    .line 93
    invoke-virtual {p1}, LR/e;->i()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :goto_3
    iget-object p2, p0, Lv0/A;->L:LR/e;

    .line 98
    .line 99
    invoke-virtual {p2}, LR/e;->i()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :catchall_1
    move-exception p1

    .line 104
    monitor-exit v0

    .line 105
    throw p1
.end method

.method public final y0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv0/A;->H:LM5/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lc0/n;

    .line 6
    .line 7
    const-string v2, "Pointer input was reset"

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    invoke-direct {v1, v2, v3}, Lc0/n;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, LM5/i0;->t(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lv0/A;->H:LM5/B;

    .line 18
    .line 19
    :cond_0
    return-void
.end method
