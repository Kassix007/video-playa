.class public final Le0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public A:J

.field public final B:Lr/v;

.field public C:LC0/V0;

.field public D:Z

.field public final E:LC0/m;

.field public final q:LC0/A;

.field public final r:LC0/q;

.field public s:LE0/c;

.field public final t:Ljava/util/ArrayList;

.field public final u:J

.field public v:Le0/a;

.field public w:Z

.field public final x:LO5/e;

.field public final y:Landroid/os/Handler;

.field public z:Lr/v;


# direct methods
.method public constructor <init>(LC0/A;LC0/q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le0/c;->q:LC0/A;

    .line 5
    .line 6
    iput-object p2, p0, Le0/c;->r:LC0/q;

    .line 7
    .line 8
    new-instance p2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Le0/c;->t:Ljava/util/ArrayList;

    .line 14
    .line 15
    const-wide/16 v0, 0x64

    .line 16
    .line 17
    iput-wide v0, p0, Le0/c;->u:J

    .line 18
    .line 19
    sget-object p2, Le0/a;->q:Le0/a;

    .line 20
    .line 21
    iput-object p2, p0, Le0/c;->v:Le0/a;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    iput-boolean p2, p0, Le0/c;->w:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-static {p2, v0, v1}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Le0/c;->x:LO5/e;

    .line 33
    .line 34
    new-instance p2, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Le0/c;->y:Landroid/os/Handler;

    .line 44
    .line 45
    sget-object p2, Lr/l;->a:Lr/v;

    .line 46
    .line 47
    const-string v0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    .line 48
    .line 49
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Le0/c;->z:Lr/v;

    .line 53
    .line 54
    new-instance v1, Lr/v;

    .line 55
    .line 56
    invoke-direct {v1}, Lr/v;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Le0/c;->B:Lr/v;

    .line 60
    .line 61
    new-instance v1, LC0/V0;

    .line 62
    .line 63
    invoke-virtual {p1}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, LI0/n;->a()LI0/m;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, p1, p2}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Le0/c;->C:LC0/V0;

    .line 78
    .line 79
    new-instance p1, LC0/m;

    .line 80
    .line 81
    const/16 p2, 0x10

    .line 82
    .line 83
    invoke-direct {p1, p2, p0}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Le0/c;->E:LC0/m;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final d(Ls5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Le0/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Le0/b;

    .line 7
    .line 8
    iget v1, v0, Le0/b;->u:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Le0/b;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le0/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Le0/b;-><init>(Le0/c;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Le0/b;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Le0/b;->u:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    if-eq v1, v3, :cond_3

    .line 36
    .line 37
    if-ne v1, v2, :cond_2

    .line 38
    .line 39
    iget-object v1, v0, Le0/b;->r:LO5/b;

    .line 40
    .line 41
    iget-object v5, v0, Le0/b;->q:Le0/c;

    .line 42
    .line 43
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    move-object p1, v5

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_3
    iget-object v1, v0, Le0/b;->r:LO5/b;

    .line 57
    .line 58
    iget-object v5, v0, Le0/b;->q:Le0/c;

    .line 59
    .line 60
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Le0/c;->x:LO5/e;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v1, LO5/b;

    .line 73
    .line 74
    invoke-direct {v1, p1}, LO5/b;-><init>(LO5/e;)V

    .line 75
    .line 76
    .line 77
    move-object p1, p0

    .line 78
    :goto_1
    iput-object p1, v0, Le0/b;->q:Le0/c;

    .line 79
    .line 80
    iput-object v1, v0, Le0/b;->r:LO5/b;

    .line 81
    .line 82
    iput v3, v0, Le0/b;->u:I

    .line 83
    .line 84
    invoke-virtual {v1, v0}, LO5/b;->b(Ls5/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-ne v5, v4, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-object v8, v5

    .line 92
    move-object v5, p1

    .line 93
    move-object p1, v8

    .line 94
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_8

    .line 101
    .line 102
    invoke-virtual {v1}, LO5/b;->c()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Le0/c;->i()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    invoke-virtual {v5}, Le0/c;->j()V

    .line 112
    .line 113
    .line 114
    :cond_6
    iget-boolean p1, v5, Le0/c;->D:Z

    .line 115
    .line 116
    if-nez p1, :cond_7

    .line 117
    .line 118
    iput-boolean v3, v5, Le0/c;->D:Z

    .line 119
    .line 120
    iget-object p1, v5, Le0/c;->y:Landroid/os/Handler;

    .line 121
    .line 122
    iget-object v6, v5, Le0/c;->E:LC0/m;

    .line 123
    .line 124
    invoke-virtual {p1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 125
    .line 126
    .line 127
    :cond_7
    iget-wide v6, v5, Le0/c;->u:J

    .line 128
    .line 129
    iput-object v5, v0, Le0/b;->q:Le0/c;

    .line 130
    .line 131
    iput-object v1, v0, Le0/b;->r:LO5/b;

    .line 132
    .line 133
    iput v2, v0, Le0/b;->u:I

    .line 134
    .line 135
    invoke-static {v6, v7, v0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v4, :cond_1

    .line 140
    .line 141
    :goto_3
    return-object v4

    .line 142
    :cond_8
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 143
    .line 144
    return-object p1
.end method

.method public final g(LI0/m;LB5/e;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    invoke-static {v0, p1}, LI0/m;->h(ILI0/m;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    if-ge v1, v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, LI0/m;

    .line 26
    .line 27
    invoke-virtual {p0}, Le0/c;->h()Lr/k;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget v4, v4, LI0/m;->g:I

    .line 32
    .line 33
    invoke-virtual {v5, v4}, Lr/k;->a(I)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {p2, v4, v3}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public final h()Lr/k;
    .locals 2

    .line 1
    iget-boolean v0, p0, Le0/c;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Le0/c;->w:Z

    .line 7
    .line 8
    iget-object v0, p0, Le0/c;->q:LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LC0/W;->f(LI0/n;)Lr/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Le0/c;->z:Lr/v;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Le0/c;->A:J

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Le0/c;->z:Lr/v;

    .line 27
    .line 28
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le0/c;->s:LE0/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final j()V
    .locals 10

    .line 1
    iget-object v0, p0, Le0/c;->s:LE0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v1, v0, LE0/c;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v3, 0x1d

    .line 12
    .line 13
    if-ge v2, v3, :cond_1

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    iget-object v2, p0, Le0/c;->t:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_7

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    move v6, v5

    .line 31
    :goto_0
    const/4 v7, 0x1

    .line 32
    if-ge v6, v4, :cond_5

    .line 33
    .line 34
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    check-cast v8, Le0/d;

    .line 39
    .line 40
    iget-object v9, v8, Le0/d;->c:Le0/e;

    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_3

    .line 47
    .line 48
    if-eq v9, v7, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget v7, v8, Le0/d;->a:I

    .line 52
    .line 53
    int-to-long v7, v7

    .line 54
    invoke-virtual {v0, v7, v8}, LE0/c;->a(J)Landroid/view/autofill/AutofillId;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    if-lt v8, v3, :cond_4

    .line 63
    .line 64
    invoke-static {v1}, LA3/a;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {v8, v7}, LE0/b;->e(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget-object v7, v8, Le0/d;->d:Lk3/c;

    .line 73
    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    iget-object v7, v7, Lk3/c;->q:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Landroid/view/ViewStructure;

    .line 79
    .line 80
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    if-lt v8, v3, :cond_4

    .line 83
    .line 84
    invoke-static {v1}, LA3/a;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-static {v8, v7}, LE0/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 95
    .line 96
    if-lt v4, v3, :cond_6

    .line 97
    .line 98
    invoke-static {v1}, LA3/a;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-object v0, v0, LE0/c;->b:Landroid/view/View;

    .line 103
    .line 104
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/P1;->B(Landroid/view/View;)LE0/a;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    iget-object v0, v0, LE0/a;->a:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v0}, LC0/U;->h(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-array v3, v7, [J

    .line 118
    .line 119
    const-wide/high16 v6, -0x8000000000000000L

    .line 120
    .line 121
    aput-wide v6, v3, v5

    .line 122
    .line 123
    invoke-static {v1, v0, v3}, LE0/b;->g(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_7
    :goto_2
    return-void
.end method

.method public final k(LI0/m;LC0/V0;)V
    .locals 5

    .line 1
    new-instance v0, LB0/j0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1, p2, p0}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Le0/c;->g(LI0/m;LB5/e;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x4

    .line 12
    invoke-static {p2, p1}, LI0/m;->h(ILI0/m;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    move-object p2, p1

    .line 17
    check-cast p2, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-ge v0, p2, :cond_2

    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LI0/m;

    .line 31
    .line 32
    invoke-virtual {p0}, Le0/c;->h()Lr/k;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget v3, v1, LI0/m;->g:I

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lr/k;->a(I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget-object v2, p0, Le0/c;->B:Lr/v;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lr/k;->a(I)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lr/k;->b(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    check-cast v2, LC0/V0;

    .line 59
    .line 60
    invoke-virtual {p0, v1, v2}, Le0/c;->k(LI0/m;LC0/V0;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    const-string p1, "node not present in pruned tree before this change"

    .line 65
    .line 66
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    throw p1

    .line 71
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    return-void
.end method

.method public final l(ILjava/lang/String;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, p0, Le0/c;->s:LE0/c;

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    int-to-long v3, p1

    .line 14
    invoke-virtual {v2, v3, v4}, LE0/c;->a(J)Landroid/view/autofill/AutofillId;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    if-lt v0, v1, :cond_2

    .line 21
    .line 22
    iget-object v0, v2, LE0/c;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0}, LA3/a;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1, p2}, LE0/b;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void

    .line 32
    :cond_3
    const-string p1, "Invalid content capture ID"

    .line 33
    .line 34
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    throw p1
.end method

.method public final m(ILI0/m;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Le0/c;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, v1, LI0/m;->d:LI0/i;

    .line 13
    .line 14
    iget-object v2, v2, LI0/i;->q:Lr/G;

    .line 15
    .line 16
    sget-object v3, LI0/p;->A:LI0/s;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    move-object v3, v4

    .line 26
    :cond_1
    check-cast v3, Ljava/lang/Boolean;

    .line 27
    .line 28
    iget-object v5, v0, Le0/c;->v:Le0/a;

    .line 29
    .line 30
    sget-object v6, Le0/a;->q:Le0/a;

    .line 31
    .line 32
    if-ne v5, v6, :cond_3

    .line 33
    .line 34
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    sget-object v3, LI0/h;->l:LI0/s;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    move-object v2, v4

    .line 51
    :cond_2
    check-cast v2, LI0/a;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    iget-object v2, v2, LI0/a;->b:Lm5/e;

    .line 56
    .line 57
    check-cast v2, LB5/c;

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-interface {v2, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v5, v0, Le0/c;->v:Le0/a;

    .line 71
    .line 72
    sget-object v6, Le0/a;->r:Le0/a;

    .line 73
    .line 74
    if-ne v5, v6, :cond_5

    .line 75
    .line 76
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    sget-object v3, LI0/h;->l:LI0/s;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    move-object v2, v4

    .line 93
    :cond_4
    check-cast v2, LI0/a;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v2, v2, LI0/a;->b:Lm5/e;

    .line 98
    .line 99
    check-cast v2, LB5/c;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v2, v3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Boolean;

    .line 110
    .line 111
    :cond_5
    :goto_0
    iget v6, v1, LI0/m;->g:I

    .line 112
    .line 113
    iget-object v2, v0, Le0/c;->s:LE0/c;

    .line 114
    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    :goto_1
    move-object v10, v4

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_6
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    const/16 v5, 0x1d

    .line 123
    .line 124
    if-ge v3, v5, :cond_7

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    iget-object v7, v0, Le0/c;->q:LC0/A;

    .line 128
    .line 129
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/P1;->B(Landroid/view/View;)LE0/a;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    if-nez v7, :cond_8

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_8
    invoke-virtual {v1}, LI0/m;->j()LI0/m;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    iget v9, v1, LI0/m;->g:I

    .line 141
    .line 142
    if-eqz v8, :cond_9

    .line 143
    .line 144
    iget v7, v8, LI0/m;->g:I

    .line 145
    .line 146
    int-to-long v7, v7

    .line 147
    invoke-virtual {v2, v7, v8}, LE0/c;->a(J)Landroid/view/autofill/AutofillId;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    if-nez v7, :cond_a

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_9
    iget-object v7, v7, LE0/a;->a:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-static {v7}, LC0/U;->h(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    :cond_a
    int-to-long v10, v9

    .line 161
    if-lt v3, v5, :cond_b

    .line 162
    .line 163
    iget-object v2, v2, LE0/c;->a:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-static {v2}, LA3/a;->g(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v2, v7, v10, v11}, LE0/b;->c(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    new-instance v3, Lk3/c;

    .line 174
    .line 175
    invoke-direct {v3, v2}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_b
    move-object v3, v4

    .line 180
    :goto_2
    if-nez v3, :cond_c

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_c
    iget-object v2, v3, Lk3/c;->q:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v10, v2

    .line 186
    check-cast v10, Landroid/view/ViewStructure;

    .line 187
    .line 188
    iget-object v2, v1, LI0/m;->d:LI0/i;

    .line 189
    .line 190
    sget-object v5, LI0/p;->G:LI0/s;

    .line 191
    .line 192
    iget-object v7, v2, LI0/i;->q:Lr/G;

    .line 193
    .line 194
    invoke-virtual {v7, v5}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_d

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_d
    invoke-virtual {v10}, Landroid/view/ViewStructure;->getExtras()Landroid/os/Bundle;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    if-eqz v5, :cond_e

    .line 206
    .line 207
    const-string v8, "android.view.contentcapture.EventTimestamp"

    .line 208
    .line 209
    iget-wide v11, v0, Le0/c;->A:J

    .line 210
    .line 211
    invoke-virtual {v5, v8, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 212
    .line 213
    .line 214
    const-string v8, "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"

    .line 215
    .line 216
    move/from16 v11, p1

    .line 217
    .line 218
    invoke-virtual {v5, v8, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    :cond_e
    sget-object v5, LI0/p;->w:LI0/s;

    .line 222
    .line 223
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    if-nez v5, :cond_f

    .line 228
    .line 229
    move-object v5, v4

    .line 230
    :cond_f
    check-cast v5, Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v5, :cond_10

    .line 233
    .line 234
    invoke-virtual {v10, v9, v4, v4, v5}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_10
    sget-object v5, LI0/p;->m:LI0/s;

    .line 238
    .line 239
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    if-nez v5, :cond_11

    .line 244
    .line 245
    move-object v5, v4

    .line 246
    :cond_11
    check-cast v5, Ljava/lang/Boolean;

    .line 247
    .line 248
    if-eqz v5, :cond_12

    .line 249
    .line 250
    const-string v5, "android.widget.ViewGroup"

    .line 251
    .line 252
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_12
    sget-object v5, LI0/p;->y:LI0/s;

    .line 256
    .line 257
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-nez v5, :cond_13

    .line 262
    .line 263
    move-object v5, v4

    .line 264
    :cond_13
    check-cast v5, Ljava/util/List;

    .line 265
    .line 266
    const/16 v8, 0x3e

    .line 267
    .line 268
    const-string v9, "\n"

    .line 269
    .line 270
    if-eqz v5, :cond_14

    .line 271
    .line 272
    const-string v11, "android.widget.TextView"

    .line 273
    .line 274
    invoke-virtual {v10, v11}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v8, v9, v5}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    :cond_14
    sget-object v5, LI0/p;->C:LI0/s;

    .line 285
    .line 286
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    if-nez v5, :cond_15

    .line 291
    .line 292
    move-object v5, v4

    .line 293
    :cond_15
    check-cast v5, LL0/d;

    .line 294
    .line 295
    if-eqz v5, :cond_16

    .line 296
    .line 297
    const-string v11, "android.widget.EditText"

    .line 298
    .line 299
    invoke-virtual {v10, v11}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    :cond_16
    sget-object v5, LI0/p;->a:LI0/s;

    .line 306
    .line 307
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    if-nez v5, :cond_17

    .line 312
    .line 313
    move-object v5, v4

    .line 314
    :cond_17
    check-cast v5, Ljava/util/List;

    .line 315
    .line 316
    if-eqz v5, :cond_18

    .line 317
    .line 318
    invoke-static {v8, v9, v5}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 323
    .line 324
    .line 325
    :cond_18
    sget-object v5, LI0/p;->v:LI0/s;

    .line 326
    .line 327
    invoke-virtual {v7, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    if-nez v5, :cond_19

    .line 332
    .line 333
    move-object v5, v4

    .line 334
    :cond_19
    check-cast v5, LI0/f;

    .line 335
    .line 336
    if-eqz v5, :cond_1a

    .line 337
    .line 338
    iget v5, v5, LI0/f;->a:I

    .line 339
    .line 340
    invoke-static {v5}, LC0/W;->r(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    if-eqz v5, :cond_1a

    .line 345
    .line 346
    invoke-virtual {v10, v5}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    :cond_1a
    invoke-static {v2}, LC0/W;->h(LI0/i;)LL0/C;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    if-eqz v2, :cond_1b

    .line 354
    .line 355
    iget-object v2, v2, LL0/C;->a:LL0/B;

    .line 356
    .line 357
    iget-object v5, v2, LL0/B;->b:LL0/F;

    .line 358
    .line 359
    iget-object v2, v2, LL0/B;->g:LW0/c;

    .line 360
    .line 361
    iget-object v5, v5, LL0/F;->a:LL0/y;

    .line 362
    .line 363
    iget-wide v7, v5, LL0/y;->b:J

    .line 364
    .line 365
    invoke-static {v7, v8}, LW0/n;->c(J)F

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    invoke-interface {v2}, LW0/c;->b()F

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    mul-float/2addr v7, v5

    .line 374
    invoke-interface {v2}, LW0/c;->l()F

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    mul-float/2addr v2, v7

    .line 379
    const/4 v5, 0x0

    .line 380
    invoke-virtual {v10, v2, v5, v5, v5}, Landroid/view/ViewStructure;->setTextStyle(FIII)V

    .line 381
    .line 382
    .line 383
    :cond_1b
    invoke-virtual {v1}, LI0/m;->j()LI0/m;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    sget-object v5, Li0/c;->e:Li0/c;

    .line 388
    .line 389
    if-nez v2, :cond_1c

    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_1c
    invoke-virtual {v1}, LI0/m;->c()LB0/n0;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    if-eqz v7, :cond_1e

    .line 397
    .line 398
    invoke-virtual {v7}, LB0/n0;->B0()Lc0/l;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    iget-boolean v8, v8, Lc0/l;->D:Z

    .line 403
    .line 404
    if-eqz v8, :cond_1d

    .line 405
    .line 406
    move-object v4, v7

    .line 407
    :cond_1d
    if-eqz v4, :cond_1e

    .line 408
    .line 409
    iget-object v2, v2, LI0/m;->a:Lc0/l;

    .line 410
    .line 411
    const/16 v5, 0x8

    .line 412
    .line 413
    invoke-static {v2, v5}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const/4 v5, 0x1

    .line 418
    invoke-virtual {v2, v4, v5}, LB0/n0;->I(Lz0/m;Z)Li0/c;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    :cond_1e
    :goto_3
    iget v2, v5, Li0/c;->a:F

    .line 423
    .line 424
    float-to-int v11, v2

    .line 425
    iget v4, v5, Li0/c;->b:F

    .line 426
    .line 427
    float-to-int v12, v4

    .line 428
    iget v7, v5, Li0/c;->c:F

    .line 429
    .line 430
    sub-float/2addr v7, v2

    .line 431
    float-to-int v15, v7

    .line 432
    iget v2, v5, Li0/c;->d:F

    .line 433
    .line 434
    sub-float/2addr v2, v4

    .line 435
    float-to-int v2, v2

    .line 436
    const/4 v13, 0x0

    .line 437
    const/4 v14, 0x0

    .line 438
    move/from16 v16, v2

    .line 439
    .line 440
    invoke-virtual/range {v10 .. v16}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 441
    .line 442
    .line 443
    move-object v10, v3

    .line 444
    :goto_4
    if-nez v10, :cond_1f

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_1f
    new-instance v5, Le0/d;

    .line 448
    .line 449
    iget-wide v7, v0, Le0/c;->A:J

    .line 450
    .line 451
    sget-object v9, Le0/e;->q:Le0/e;

    .line 452
    .line 453
    invoke-direct/range {v5 .. v10}, Le0/d;-><init>(IJLe0/e;Lk3/c;)V

    .line 454
    .line 455
    .line 456
    iget-object v2, v0, Le0/c;->t:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    :goto_5
    new-instance v2, LA/e0;

    .line 462
    .line 463
    const/16 v3, 0xe

    .line 464
    .line 465
    invoke-direct {v2, v3, v0}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v1, v2}, Le0/c;->g(LI0/m;LB5/e;)V

    .line 469
    .line 470
    .line 471
    return-void
.end method

.method public final n(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le0/c;->r:LC0/q;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/q;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE0/c;

    .line 8
    .line 9
    iput-object p1, p0, Le0/c;->s:LE0/c;

    .line 10
    .line 11
    iget-object p1, p0, Le0/c;->q:LC0/A;

    .line 12
    .line 13
    invoke-virtual {p1}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, LI0/n;->a()LI0/m;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0, p1}, Le0/c;->m(ILI0/m;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Le0/c;->j()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final o(LI0/m;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Le0/c;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v2, p1, LI0/m;->g:I

    .line 9
    .line 10
    new-instance v1, Le0/d;

    .line 11
    .line 12
    iget-wide v3, p0, Le0/c;->A:J

    .line 13
    .line 14
    sget-object v5, Le0/e;->r:Le0/e;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Le0/d;-><init>(IJLe0/e;Lk3/c;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Le0/c;->t:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-static {v0, p1}, LI0/m;->h(ILI0/m;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_0
    if-ge v1, v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, LI0/m;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Le0/c;->o(LI0/m;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le0/c;->y:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Le0/c;->E:LC0/m;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Le0/c;->s:LE0/c;

    .line 10
    .line 11
    return-void
.end method

.method public final v(Landroidx/lifecycle/x;)V
    .locals 0

    .line 1
    iget-object p1, p0, Le0/c;->q:LC0/A;

    .line 2
    .line 3
    invoke-virtual {p1}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LI0/n;->a()LI0/m;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Le0/c;->o(LI0/m;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Le0/c;->j()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Le0/c;->s:LE0/c;

    .line 19
    .line 20
    return-void
.end method
