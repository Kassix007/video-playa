.class public final Le3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/B;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LM5/h;


# direct methods
.method public synthetic constructor <init>(LM5/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Le3/q;->a:I

    iput-object p1, p0, Le3/q;->b:LM5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Le3/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object v0, p0, Le3/q;->b:LM5/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LM5/h;->w()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, Le3/q;->b:LM5/h;

    .line 28
    .line 29
    invoke-virtual {v0}, LM5/h;->w()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
