.class public final LH2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final r:Lh6/h;

.field public final s:LM5/h;


# direct methods
.method public synthetic constructor <init>(Lh6/h;LM5/h;I)V
    .locals 0

    .line 1
    iput p3, p0, LH2/g;->q:I

    iput-object p1, p0, LH2/g;->r:Lh6/h;

    iput-object p2, p0, LH2/g;->s:LM5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh6/h;Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget v0, p0, LH2/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p1, Lh6/h;->C:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LH2/g;->s:LM5/h;

    .line 11
    .line 12
    invoke-static {p2}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p1, p2}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-boolean p1, p1, Lh6/h;->C:Z

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, LH2/g;->s:LM5/h;

    .line 25
    .line 26
    invoke-static {p2}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LH2/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    :try_start_0
    iget-object p1, p0, LH2/g;->r:Lh6/h;

    .line 9
    .line 10
    invoke-virtual {p1}, Lh6/h;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :catchall_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 17
    .line 18
    :try_start_1
    iget-object p1, p0, LH2/g;->r:Lh6/h;

    .line 19
    .line 20
    invoke-virtual {p1}, Lh6/h;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    :catchall_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
