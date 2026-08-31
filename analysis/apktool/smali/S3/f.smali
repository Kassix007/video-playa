.class public abstract LS3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO3/Q0;

.field public static final b:LS3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO3/Q0;

    .line 2
    .line 3
    invoke-direct {v0}, LO3/Q0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS3/f;->a:LO3/Q0;

    .line 7
    .line 8
    new-instance v0, LS3/j;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, LS3/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LS3/f;->b:LS3/j;

    .line 15
    .line 16
    return-void
.end method
