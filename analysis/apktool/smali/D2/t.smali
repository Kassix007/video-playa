.class public final LD2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD2/q;


# instance fields
.field public final q:Lt2/l;

.field public final r:LD2/j;

.field public final s:LF2/a;

.field public final t:Landroidx/lifecycle/q;

.field public final u:LM5/b0;


# direct methods
.method public constructor <init>(Lt2/l;LD2/j;LF2/a;Landroidx/lifecycle/q;LM5/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD2/t;->q:Lt2/l;

    .line 5
    .line 6
    iput-object p2, p0, LD2/t;->r:LD2/j;

    .line 7
    .line 8
    iput-object p3, p0, LD2/t;->s:LF2/a;

    .line 9
    .line 10
    iput-object p4, p0, LD2/t;->t:Landroidx/lifecycle/q;

    .line 11
    .line 12
    iput-object p5, p0, LD2/t;->u:LM5/b0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/x;)V
    .locals 5

    .line 1
    iget-object p1, p0, LD2/t;->s:LF2/a;

    .line 2
    .line 3
    iget-object p1, p1, LF2/a;->r:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-static {p1}, LH2/f;->c(Landroid/widget/ImageView;)LD2/v;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    monitor-enter p1

    .line 10
    :try_start_0
    iget-object v0, p1, LD2/v;->r:LM5/B;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, LM5/i0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    sget-object v0, LM5/V;->q:LM5/V;

    .line 22
    .line 23
    sget-object v2, LM5/H;->a:LT5/e;

    .line 24
    .line 25
    sget-object v2, LR5/n;->a:LN5/f;

    .line 26
    .line 27
    iget-object v2, v2, LN5/f;->t:LN5/f;

    .line 28
    .line 29
    new-instance v3, LD2/u;

    .line 30
    .line 31
    invoke-direct {v3, p1, v1}, LD2/u;-><init>(LD2/v;Lq5/c;)V

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-static {v0, v2, v1, v3, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p1, LD2/v;->r:LM5/B;

    .line 40
    .line 41
    iput-object v1, p1, LD2/v;->q:LD2/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit p1

    .line 44
    return-void

    .line 45
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, LD2/t;->s:LF2/a;

    .line 2
    .line 3
    iget-object v1, v0, LF2/a;->r:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, v0, LF2/a;->r:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-static {v0}, LH2/f;->c(Landroid/widget/ImageView;)LD2/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, v0, LD2/v;->s:LD2/t;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v2, v1, LD2/t;->t:Landroidx/lifecycle/q;

    .line 23
    .line 24
    iget-object v3, v1, LD2/t;->u:LM5/b0;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-interface {v3, v4}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v1, LD2/t;->s:LF2/a;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iput-object p0, v0, LD2/v;->s:LD2/t;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 43
    .line 44
    const-string v1, "\'ViewTarget.view\' must be attached to a window."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public final start()V
    .locals 5

    .line 1
    iget-object v0, p0, LD2/t;->t:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LD2/t;->s:LF2/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, v1, LF2/a;->r:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-static {v0}, LH2/f;->c(Landroid/widget/ImageView;)LD2/v;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, v0, LD2/v;->s:LD2/t;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v2, v1, LD2/t;->t:Landroidx/lifecycle/q;

    .line 27
    .line 28
    iget-object v3, v1, LD2/t;->u:LM5/b0;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-interface {v3, v4}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, LD2/t;->s:LF2/a;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v2, v1}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iput-object p0, v0, LD2/v;->s:LD2/t;

    .line 45
    .line 46
    return-void
.end method
