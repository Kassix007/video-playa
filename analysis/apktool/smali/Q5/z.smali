.class public final synthetic LQ5/z;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements LB5/f;


# static fields
.field public static final q:LQ5/z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LQ5/z;

    .line 2
    .line 3
    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, LP5/i;

    .line 8
    .line 9
    const-string v3, "emit"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LQ5/z;->q:LQ5/z;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP5/i;

    .line 2
    .line 3
    check-cast p3, Lq5/c;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
