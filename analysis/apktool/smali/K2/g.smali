.class public final LK2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/E;


# instance fields
.field public final synthetic q:I

.field public r:Z

.field public final s:Ljava/lang/Object;

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj6/f;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK2/g;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2/g;->t:Ljava/lang/Object;

    .line 5
    new-instance v0, Lq6/p;

    .line 6
    iget-object p1, p1, Lj6/f;->d:Lq6/h;

    .line 7
    invoke-interface {p1}, Lq6/E;->d()Lq6/I;

    move-result-object p1

    invoke-direct {v0, p1}, Lq6/p;-><init>(Lq6/I;)V

    iput-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq6/E;LJ5/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK2/g;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LK2/g;->s:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LK2/g;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final Z(JLq6/g;)V
    .locals 6

    .line 1
    iget v0, p0, LK2/g;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LK2/g;->t:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "source"

    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, LK2/g;->r:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-wide v2, p3, Lq6/g;->r:J

    .line 18
    .line 19
    sget-object v0, Le6/b;->a:[B

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v0, p1, v4

    .line 24
    .line 25
    if-ltz v0, :cond_0

    .line 26
    .line 27
    cmp-long v0, v4, v2

    .line 28
    .line 29
    if-gtz v0, :cond_0

    .line 30
    .line 31
    cmp-long v0, v2, p1

    .line 32
    .line 33
    if-ltz v0, :cond_0

    .line 34
    .line 35
    check-cast v1, Lj6/f;

    .line 36
    .line 37
    iget-object v0, v1, Lj6/f;->d:Lq6/h;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2, p3}, Lq6/E;->Z(JLq6/g;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "closed"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :pswitch_0
    iget-boolean v0, p0, LK2/g;->r:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p3, p1, p2}, Lq6/g;->skip(J)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :try_start_0
    iget-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lq6/E;

    .line 68
    .line 69
    invoke-interface {v0, p1, p2, p3}, Lq6/E;->Z(JLq6/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception p1

    .line 74
    const/4 p2, 0x1

    .line 75
    iput-boolean p2, p0, LK2/g;->r:Z

    .line 76
    .line 77
    check-cast v1, LJ5/i;

    .line 78
    .line 79
    invoke-virtual {v1, p1}, LJ5/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 4

    .line 1
    iget v0, p0, LK2/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK2/g;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj6/f;

    .line 9
    .line 10
    iget-boolean v1, p0, LK2/g;->r:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, LK2/g;->r:Z

    .line 17
    .line 18
    iget-object v1, p0, LK2/g;->s:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lq6/p;

    .line 21
    .line 22
    iget-object v2, v1, Lq6/p;->e:Lq6/I;

    .line 23
    .line 24
    sget-object v3, Lq6/I;->d:Lq6/H;

    .line 25
    .line 26
    iput-object v3, v1, Lq6/p;->e:Lq6/I;

    .line 27
    .line 28
    invoke-virtual {v2}, Lq6/I;->a()Lq6/I;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lq6/I;->b()Lq6/I;

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    iput v1, v0, Lj6/f;->e:I

    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    :try_start_0
    iget-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lq6/E;

    .line 41
    .line 42
    invoke-interface {v0}, Lq6/E;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception v0

    .line 47
    const/4 v1, 0x1

    .line 48
    iput-boolean v1, p0, LK2/g;->r:Z

    .line 49
    .line 50
    iget-object v1, p0, LK2/g;->t:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LJ5/i;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, LJ5/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lq6/I;
    .locals 1

    .line 1
    iget v0, p0, LK2/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq6/p;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lq6/E;

    .line 14
    .line 15
    invoke-interface {v0}, Lq6/E;->d()Lq6/I;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget v0, p0, LK2/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LK2/g;->r:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, LK2/g;->t:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lj6/f;

    .line 14
    .line 15
    iget-object v0, v0, Lj6/f;->d:Lq6/h;

    .line 16
    .line 17
    invoke-interface {v0}, Lq6/h;->flush()V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :pswitch_0
    :try_start_0
    iget-object v0, p0, LK2/g;->s:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lq6/E;

    .line 24
    .line 25
    invoke-interface {v0}, Lq6/E;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception v0

    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, LK2/g;->r:Z

    .line 32
    .line 33
    iget-object v1, p0, LK2/g;->t:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LJ5/i;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, LJ5/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :goto_1
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
