.class public final Lt2/k;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LD2/j;

.field public final synthetic s:Lt2/l;

.field public final synthetic t:LE2/h;

.field public final synthetic u:Lt2/c;

.field public final synthetic v:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(LD2/j;Lt2/l;LE2/h;Lt2/c;Landroid/graphics/Bitmap;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt2/k;->r:LD2/j;

    .line 2
    .line 3
    iput-object p2, p0, Lt2/k;->s:Lt2/l;

    .line 4
    .line 5
    iput-object p3, p0, Lt2/k;->t:LE2/h;

    .line 6
    .line 7
    iput-object p4, p0, Lt2/k;->u:Lt2/c;

    .line 8
    .line 9
    iput-object p5, p0, Lt2/k;->v:Landroid/graphics/Bitmap;

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
    new-instance v0, Lt2/k;

    .line 2
    .line 3
    iget-object v4, p0, Lt2/k;->u:Lt2/c;

    .line 4
    .line 5
    iget-object v5, p0, Lt2/k;->v:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v1, p0, Lt2/k;->r:LD2/j;

    .line 8
    .line 9
    iget-object v2, p0, Lt2/k;->s:Lt2/l;

    .line 10
    .line 11
    iget-object v3, p0, Lt2/k;->t:LE2/h;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lt2/k;-><init>(LD2/j;Lt2/l;LE2/h;Lt2/c;Landroid/graphics/Bitmap;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lt2/k;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lt2/k;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lt2/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lt2/k;->q:I

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
    new-instance v2, LM2/k;

    .line 24
    .line 25
    iget-object p1, p0, Lt2/k;->s:Lt2/l;

    .line 26
    .line 27
    iget-object v4, p1, Lt2/l;->h:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object p1, p0, Lt2/k;->v:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    move v9, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    move v9, p1

    .line 37
    :goto_0
    iget-object v3, p0, Lt2/k;->r:LD2/j;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    iget-object v7, p0, Lt2/k;->t:LE2/h;

    .line 41
    .line 42
    iget-object v8, p0, Lt2/k;->u:Lt2/c;

    .line 43
    .line 44
    move-object v6, v3

    .line 45
    invoke-direct/range {v2 .. v9}, LM2/k;-><init>(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 46
    .line 47
    .line 48
    iput v1, p0, Lt2/k;->q:I

    .line 49
    .line 50
    invoke-virtual {v2, v3, p0}, LM2/k;->b(LD2/j;Ls5/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 55
    .line 56
    if-ne p1, v0, :cond_3

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    return-object p1
.end method
