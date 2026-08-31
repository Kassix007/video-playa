.class public final synthetic LZ4/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LZ4/M;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LZ4/M;LP/W;I)V
    .locals 0

    .line 1
    iput p3, p0, LZ4/A;->q:I

    iput-object p1, p0, LZ4/A;->r:LZ4/M;

    iput-object p2, p0, LZ4/A;->s:LP/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LZ4/A;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ4/A;->s:LP/W;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, LZ4/L;->e(LP/W;Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LZ4/A;->r:LZ4/M;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LZ4/M;->d(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, LZ4/A;->s:LP/W;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v0, v1}, LZ4/L;->e(LP/W;Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LZ4/A;->r:LZ4/M;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v1, ""

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LZ4/M;->d(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
