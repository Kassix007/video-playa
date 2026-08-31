.class public abstract LT1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LD2/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LD2/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LI5/m;

    .line 8
    .line 9
    const/16 v2, 0xd

    .line 10
    .line 11
    invoke-direct {v1, v2}, LI5/m;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v2, LT1/i;

    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2, v1}, LD2/o;->a(Lkotlin/jvm/internal/f;LB5/c;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LD2/o;->c()LP1/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LT1/j;->a:LP1/d;

    .line 28
    .line 29
    return-void
.end method
