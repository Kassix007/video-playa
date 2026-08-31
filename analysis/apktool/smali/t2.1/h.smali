.class public final Lt2/h;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LD2/j;

.field public final synthetic t:Lt2/l;


# direct methods
.method public constructor <init>(LD2/j;Lq5/c;Lt2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/h;->s:LD2/j;

    .line 2
    .line 3
    iput-object p3, p0, Lt2/h;->t:Lt2/l;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lt2/h;

    .line 2
    .line 3
    iget-object v1, p0, Lt2/h;->s:LD2/j;

    .line 4
    .line 5
    iget-object v2, p0, Lt2/h;->t:Lt2/l;

    .line 6
    .line 7
    invoke-direct {v0, v1, p2, v2}, Lt2/h;-><init>(LD2/j;Lq5/c;Lt2/l;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lt2/h;->r:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lt2/h;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lt2/h;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt2/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lt2/h;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lt2/h;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    sget-object v0, LM5/H;->a:LT5/e;

    .line 28
    .line 29
    sget-object v0, LR5/n;->a:LN5/f;

    .line 30
    .line 31
    iget-object v0, v0, LN5/f;->t:LN5/f;

    .line 32
    .line 33
    new-instance v2, Lt2/g;

    .line 34
    .line 35
    iget-object v3, p0, Lt2/h;->t:Lt2/l;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iget-object v5, p0, Lt2/h;->s:LD2/j;

    .line 39
    .line 40
    invoke-direct {v2, v5, v4, v3}, Lt2/g;-><init>(LD2/j;Lq5/c;Lt2/l;)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-static {p1, v0, v2, v3}, LM5/y;->d(LM5/w;LN5/f;LB5/e;I)LM5/B;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, v5, LD2/j;->c:LF2/b;

    .line 49
    .line 50
    check-cast v0, LF2/a;

    .line 51
    .line 52
    iget-object v0, v0, LF2/a;->r:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-static {v0}, LH2/f;->c(Landroid/widget/ImageView;)LD2/v;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, LD2/v;->a()LD2/l;

    .line 59
    .line 60
    .line 61
    iput v1, p0, Lt2/h;->q:I

    .line 62
    .line 63
    invoke-virtual {p1, p0}, LM5/i0;->r(Ls5/i;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 68
    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    return-object p1
.end method
